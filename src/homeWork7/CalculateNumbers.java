package homeWork7;

import homeWork1.Calculate;
import homeWork3.Calculate3;
import homeWork5.Simpson;
import homeWork6.SearchAlgorithm;
/*********Class Head**********
/*Class Name: CalculateNumbers               
/*Member Variable: Simpson s, String name1, String name2, Calculate3 c, SearchAlgorithm sc, Calculate c1, double xk.                             
/***************************/
public class CalculateNumbers {

	Simpson s=new Simpson();
	public String name1=null;
	public String name2=null;
	Calculate3 c=new Calculate3();
	SearchAlgorithm sc=new SearchAlgorithm();
	Calculate c1=new Calculate();
	public double xk;
	
	/*********Method Head*********
	/*Method name: getX
	*/
	public double getX(double p,int dof){
		double result=0;
		sc.dof=dof;
		sc.p=p;
		result=sc.getX();
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getRxy
	*/
	public double getRxy(){
		double result=0;
		result=c.rxy(name1, name2);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getRSequare
	*/
	public double getRSequare(){
		double result=0;
		result=c.rSquare(name1, name2);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getTailArea
	*/
	public double getTailArea(){
		double result=0;
		int n=c1.getColumn(name1).length;
		double x=(Math.abs(getRxy())*Math.sqrt(n-2))/Math.sqrt(1-getRxy()*getRxy());
		s.dof=n-2;
		s.x=x;
		double p=s.p();
		result=1-2*p;
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getB0
	*/
	public double getB0(){
		double result=0;
		result=c.beta0(name1, name2);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getB1
	*/
	public double getB1(){
		double result=0;
		result=c.beta1(name1, name2);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getYk
	*/
	public double getYk(){
		double result=0;
		result=c.yk(name1, name2);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getRange
	*/
	public double getRange(double p,String name1,String name2){
		double result=0;
		double[]temp1=c1.getColumn(name1);
		double[]temp2=c1.getColumn(name2);
		
		double t=getX(p,temp1.length-2);
		
		double tempDelta=0;
		double B0=getB0();
		double B1=getB1();
		for(int n=0;n<temp1.length;n++){
			tempDelta+=(temp2[n]-B0-B1*temp1[n])*(temp2[n]-B0-B1*temp1[n]);
		}
		tempDelta=Math.sqrt((1.0/(temp1.length-2))*tempDelta);
		
		double temp=0;
		double xAvg=c1.toMean(name1);
		for(int n=0;n<temp1.length;n++){
			temp+=(temp1[n]-xAvg)*(temp1[n]-xAvg);
		}
		temp=Math.sqrt(1.0+1.0/temp1.length+((xk-xAvg)*(xk-xAvg))/temp);
		
		result=(t*tempDelta)*temp;
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getUPI
	*/
	public double getUPI(){
		double result=0;
		result=getYk()+getRange(0.35,name1,name2);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getLPI
	*/
	public double getLPI(){
		double result=0;
		result=getYk()-getRange(0.35,name1,name2);
		if(result<0)
			result=0;
		return result;
	}
	/*********Method End*********/
}
/*********Class End*********/
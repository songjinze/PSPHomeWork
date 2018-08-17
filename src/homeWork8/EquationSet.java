package homeWork8;

import homeWork1.Calculate;
import homeWork6.SearchAlgorithm;

/***************************
/*Program Assignment: Calculation      
/*Author: SJZ                             
/*Date: 2017/07/18                   
/*Description:               
/***************************/

/*********Class Head**********
/*Class Name: EquationSet              
/*Member Variable: Calculate c, SearchAlgorithm s,String name1, String name2, String name3, String name4, double xk, double yk, double wk.            
/*Method: double[]getB(), double getUPI(), double getLPI(), double getPH(), double getRange()                  
/***************************/
public class EquationSet {

	Calculate c=new Calculate();
	SearchAlgorithm s=new SearchAlgorithm();
	public String name1=null;
	public String name2=null;
	public String name3=null;
	public String name4=null;
	public double wk=0;
	public double xk=0;
	public double yk=0;
	
	/*********Method Head*********
	/*Method name: getB
	*/
	public double[] getB(){
		double[]temp1=c.getColumn(name1);
		double[]temp2=c.getColumn(name2);
		double[]temp3=c.getColumn(name3);
		double[]temp4=c.getColumn(name4);
		
		double[]results=new double[4];
		double[][]temp=new double[4][5];
		double wAll=0;
		double xAll=0;
		double yAll=0;
		double zAll=0;
		double wwAll=0;
		double wxAll=0;
		double wyAll=0;
		double wzAll=0;
		double xxAll=0;
		double xyAll=0;
		double xzAll=0;
		double yyAll=0;
		double yzAll=0;
		temp[0][0]=temp1.length;
		for(int n=0;n<temp1.length;n++){
			wAll+=temp1[n];
			xAll+=temp2[n];
			yAll+=temp3[n];
			zAll+=temp4[n];
			wwAll+=temp1[n]*temp1[n];
			wxAll+=temp1[n]*temp2[n];
			wyAll+=temp1[n]*temp3[n];
			wzAll+=temp1[n]*temp4[n];
			xxAll+=temp2[n]*temp2[n];
			xyAll+=temp2[n]*temp3[n];
			xzAll+=temp2[n]*temp4[n];
			yyAll+=temp3[n]*temp3[n];
			yzAll+=temp3[n]*temp4[n];
		}
		temp[0][0]=temp1.length;
		temp[0][1]=wAll;
		temp[0][2]=xAll;
		temp[0][3]=yAll;
		temp[0][4]=zAll;
		temp[1][0]=wAll;
		temp[1][1]=wwAll;
		temp[1][2]=wxAll;
		temp[1][3]=wyAll;
		temp[1][4]=wzAll;
		temp[2][0]=xAll;
		temp[2][1]=wxAll;
		temp[2][2]=xxAll;
		temp[2][3]=xyAll;
		temp[2][4]=xzAll;
		temp[3][0]=yAll;
		temp[3][1]=wyAll;
		temp[3][2]=xyAll;
		temp[3][3]=yyAll;
		temp[3][4]=yzAll;
		
		for(int n=0;n<4;n++){
			double[][]tempContainer=new double[4-n][5-n];
			
			double tempDouble=temp[n][n];
			int tempIndex=n;
			for(int i=n;i<4;i++){
				if(temp[i][n]>tempDouble){
					tempDouble=temp[i][n];
					tempIndex=i;
				}
			}
		
			for(int j=n;j<5;j++){
				double d=temp[tempIndex][n];
				tempContainer[0][j-n]=temp[tempIndex][j]/d;
			}
			int count=1;
			for(int i=n;i<4;i++){
				double d=temp[i][n];
				for(int j=n;j<5;j++){
					if(i!=tempIndex){
						tempContainer[count][j-n]=temp[i][j]-d*tempContainer[0][j-n];
					}
				}
				if(i!=tempIndex){
					count++;
				}
			}
			for(int i=n;i<4;i++){
				for(int j=n;j<5;j++){
					temp[i][j]=tempContainer[i-n][j-n];
				}
			}
		}
		
		results[3]=temp[3][4];
		results[2]=temp[2][4]-temp[2][3]*results[3];
		results[1]=temp[1][4]-temp[1][3]*results[3]-temp[1][2]*results[2];
		results[0]=temp[0][4]-temp[0][3]*results[3]-temp[0][2]*results[2]-temp[0][1]*results[1];
		
		return results;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getUPI
	*/
	public double getUPI(){
		double result=0;
		double z=getPH();
		result=z+getRange();
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getLPI
	*/
	public double getLPI(){
		double result=0;
		double z=getPH();
		result=z-getRange();
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getPH
	*/
	public double getPH(){
		double[]Bs=getB();
		double result=Bs[0]+wk*Bs[1]+xk*Bs[2]+yk*Bs[3];
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: getRange
	*/
	public double getRange(){
		double[]temp1=c.getColumn(name1);
		double[]temp2=c.getColumn(name2);
		double[]temp3=c.getColumn(name3);
		double[]temp4=c.getColumn(name4);
		double[]Bs=getB();
		double result=0;
		
		s.dof=temp1.length-4;
		s.p=0.35;
		double t=s.getX();
		
		double delta=0;
		for(int n=0;n<temp1.length;n++){
			delta+=(temp4[n]-Bs[0]-Bs[1]*temp1[n]-Bs[2]*temp2[n]-Bs[3]*temp3[n])*(temp4[n]-Bs[0]-Bs[1]*temp1[n]-Bs[2]*temp2[n]-Bs[3]*temp3[n]);
		}
		
		delta=(1.0/(temp1.length-4))*delta;
		
		delta=Math.sqrt(delta);
		
		double temp=0;
		double wAvg=c.toMean(name1);
		double xAvg=c.toMean(name2);
		double yAvg=c.toMean(name3);
		double tempW=0;
		double tempX=0;
		double tempY=0;
		for(int n=0;n<temp1.length;n++){
			tempW+=(temp1[n]-wAvg)*(temp1[n]-wAvg);
			tempX+=(temp2[n]-xAvg)*(temp2[n]-xAvg);
			tempY+=(temp3[n]-yAvg)*(temp3[n]-yAvg);
		}
		temp=1+(1.0/temp1.length)+((wk-wAvg)*(wk-wAvg))/tempW+((xk-xAvg)*(xk-xAvg))/tempX+((yk-yAvg)*(yk-yAvg))/tempY;
		temp=Math.sqrt(temp);
		
		
		
		result=t*delta*temp;
		return result;
	}
	/*********Method End*********/		
}
/*********Class End*********/
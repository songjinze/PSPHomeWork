package homeWork5;
/***************************
/*Program Assignment: Use Simpson's rule to calculate.     
/*Author: SJZ                             
/*Date: 2017/07/15                   
/*Description:Simpson¡¯s rule can be used to integrate a symmetrical statistical distribution function over a specified range (e.g., from 0 to some value x).               
/***************************/
/**************************
/* Listing Contents:                                                                               
/*    Reuse instructions: null                                                                                              
/*    Modification instructions: null                                                                                   
/*    Compilation instructions: null                                                                                                                                      
/**************************/
/*********Class Head**********
/*Class Name: Simpson               
/*Member Variable: double x, int dof.           
/*Method: double F(double iw), double T(double x), double p()                   
/***************************/
public class Simpson {

	public double x=0;
	public int dof=0;
	
	/*********Method Head*********
	/*Method name: F
	*/
	public double F(double iw){
		double result=0;
		result=(T((dof+1)/2.0)/(Math.sqrt(dof*Math.PI)*T(dof/2.0)))*Math.pow((1+(iw*iw)/dof), -(dof+1)/2.0);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: T
	*/
	public double T(double x){
		double temp=x;
		if(temp!=1&&temp!=0.5){
			return (temp-1)*T(temp-1);
		}else{
			if(temp==1)
				return 1;
			else
				return Math.sqrt(Math.PI);
		}
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: P
	*/
	public double p(){
		double result=0;
		int num_seg=100;
		double W=x/num_seg; 
		result=F(0)+F(x);
		for(int n=1;n<=num_seg-1;n+=2){
			result+=4*F(n*W);
		}
		for(int n=2;n<=num_seg-2;n+=2){
			result+=2*F(n*W);
		}
		result=(W/3)*result;
		return result;
	}
	/*********Method End*********/
}
/*********Class End*********/
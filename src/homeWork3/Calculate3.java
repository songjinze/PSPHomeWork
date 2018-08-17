package homeWork3;
import homeWork1.Calculate;

/***************************
/*Program Assignment:Calculating regression and correlationg       
/*Author:SJZ                              
/*Date:2017/07/12                    
/*Description:Calculate beta0,beta1,rxy,rSquare,yk               
/***************************/
/**************************
/* Listing Contents:                                                                               
/*    Reuse instructions                                                                                              
/*    Modification instructions                                                                                   
/*    Compilation instructions                                                                                    
/*    Includes                                                                                                              
/*    Class Calculate:                                                                                                                                                                                                       
/*         public double[] getColumn(String name)
/*         public double toMean(String name)                                                                                                      
/*    Source code in PSPHomeWork/src/homeWork1/Calculate.java                                                                 
/**************************/
/**************************
/* Reuse instructions                                                                                              
/*          public double[] getColumn(String name)                                                    
/*          Purpose: to get the numbers in the file of name.                     
/*          Limitations: the file shouldn't be empty.                   
/*          Return double[] in the file of name.
/*          
/*          public double toMean(String name)
/*          Purpose: to calculate the mean of numbers in the file of name.
/*          Limitations: the file shouldn't be empty,                            
/*          Return double of the mean.
/**************************/

/*********Class Head**********
/*Class Name: Calculate3               
/*Member Variable: Calculate c,xk=386           
/*Method: double beta0(String name1,String name2)
/*        double beta1(String name1,String name2)
/*        double rxy(String name1,String name2)             
/*        double rSquare(String name1,String name2)
/*        double yk(String name1,String name2)
/***************************/
public class Calculate3 {

	Calculate c=new Calculate();
	public double xk=386;
	
	/*********Method Head*********
	/*Method name: beta0
	*/
	public double beta0(String name1,String name2){
		double result=0;
		result=c.toMean(name2)-beta1(name1,name2)*c.toMean(name1);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: beta1
	*/
	public double beta1(String name1,String name2){
		double result=0;
		double[]nums1=c.getColumn(name1);
		double[]nums2=c.getColumn(name2);
		double temp1=0;
		double temp2=0;
		for(int n=0;n<nums1.length;n++){
			temp1+=nums1[n]*nums2[n];
			temp2+=nums1[n]*nums1[n];
		}
		temp1=temp1-nums1.length*c.toMean(name1)*c.toMean(name2);
		temp2=temp2-nums1.length*c.toMean(name1)*c.toMean(name1);
		result=temp1/temp2;	
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: rxy
	*/
	public double rxy(String name1,String name2){
		double result=0;
		double[]nums1=c.getColumn(name1);
		double[]nums2=c.getColumn(name2);
		double temp1=0;
		double temp2=0;
		double temp3=0;
		double temp4=0;
		double temp5=0;
		for(int n=0;n<nums1.length;n++){
			temp1+=nums1[n]*nums2[n];
			temp2+=nums1[n];
			temp3+=nums2[n];
			temp4+=nums1[n]*nums1[n];
			temp5+=nums2[n]*nums2[n];
		}
		result=(nums1.length*temp1-temp2*temp3)/(Math.sqrt((nums1.length*temp4-temp2*temp2)*(nums1.length*temp5-temp3*temp3)));
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: rSquare
	*/
	public double rSquare(String name1,String name2){
		double result=0;
		result=rxy(name1,name2)*rxy(name1,name2);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: yk
	*/
	public double yk(String name1,String name2){
		double result=0;
		result=beta0(name1,name2)+beta1(name1,name2)*xk;
		return result;
	}
	/*********Method End*********/
}
/*********Class End*********/
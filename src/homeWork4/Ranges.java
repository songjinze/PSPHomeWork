package homeWork4;
import homeWork1.Calculate;
/***************************
/*Program Assignment:Calculate the ranges.       
/*Author:SJZ                             
/*Date:2017/07/13                    
/*Description:Some calculation will use math methods              
/***************************/
/**************************
/* Listing Contents:                                                                               
/*    Reuse instructions:double[]getColumn()                                                                                              
/*    Modification instructions:double std_Dev(), double toMean()                                                                                   
/*    Compilation instructions                                                                                    
/*    Includes                                                                                                              
/*    Class calculate                                                                                              
/*         double[]getColumn()                                                                                                          
/*         double std_Dev()
/*         double toMean()                                                                                                       
/*   Source code in src/homeWork1/Calculate.java                                                                
/**************************/
/**************************
/* Reuse instructions                                                                                              
/*          /* Reuse instructions                                                                                              
/*          public double[] getColumn(String name)                                                    
/*          Purpose: to get the numbers in the file of name.                     
/*          Limitations: the file shouldn't be empty.                   
/*          Return double[] in the file of name.                                                      
/**************************/
/*********Class Head**********
/*Class Name: Ranges               
/*Member Variable: Calculate c, String path.          
/*Method: Ranges(String path),double avg(),double derta(),double vs(),double s(),double m(),double l(),double vL()                   
/***************************/
public class Ranges {

	Calculate c=new Calculate();
	public String path=null;
	
	/*********Method Head*********
	/*Method name: Ranges
	*/
	public Ranges(String path){
		this.path=path;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: avg
	*/
	public double avg(){
		double result=0;
		double[]sourceNums=c.getColumn(path);
		for(int n=0;n<sourceNums.length;n++){
			sourceNums[n]=Math.log(sourceNums[n]);
		}
		double count=0;
		int N=0;
		for(double d:sourceNums){
			count+=d;
			N++;
		}
		result=count/N;
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: derta
	*/
	public double derta(){
		double result=0.0;
		double[]sourceNums=c.getColumn(path);
		for(int n=0;n<sourceNums.length;n++){
			sourceNums[n]=Math.log(sourceNums[n]);
		}
		double mean=avg();
		int N=0;
		for(double d:sourceNums){
			result+=(mean-d)*(mean-d);
			N++;
		}
		result=result/(N-1);
		result=Math.sqrt(result);
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: vs
	*/
	public double vs(){
		return Math.exp(avg()-2*derta());
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: s
	*/
	public double s(){
		return Math.exp(avg()-derta());
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: m
	*/
	public double m(){
		return Math.exp(avg());
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: l
	*/
	public double l(){
		return Math.exp(avg()+derta());
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: vL
	*/
	public double vL(){
		return Math.exp(avg()+2*derta());
	}
	/*********Method End*********/
}
/*********Class End*********/

package homeWork6;
import homeWork5.Simpson;
/***************************
/*Program Assignment: Use the value of p to get the value of x      
/*Author: SJZ                              
/*Date: 2017/07/16                   
/*Description: The opposite of homework 5.              
/***************************/
/**************************
/* Listing Contents:                                                                               
/*    Reuse instructions :class Simpson.p()                                                                                             
/*    Modification instructions :null                                                                                  
/*    Compilation instructions :null                                                                                   
/*    Includes                                                                                                              
/*    Class Simpson:                                                                                              
/*         double x; int dof;                                                                                                         
/*         double p();                                                                                                               
/*   Source code in src/homeWork5/Simpson.java                                                                  
/**************************/
/**************************
/* Reuse instructions                                                                                              
/*          double p()                                                         
/*          Purpose: Use the value of x to get the true value p.                  
/*          Limitations: Should first initialze the value of x and dof.                
/*          Return double p.                                             
/**************************/
/*********Class Head**********
/*Class Name: SearchAlgorithm               
/*Member Variable: Simpson s, double d, int dof, double p.          
/*Method: double getX()                   
/***************************/
public class SearchAlgorithm {

	Simpson s=new Simpson();
	public double d=0.5;
	public int dof=0;
	public double p=0;
	
	/*********Method Head*********
	/*Method name: getX()
	*/
	public double getX(){
		boolean isMore=false;
		boolean isLess=false;
		s.x=1.0;
		s.dof=dof;
		double error=0.0000001;
		double tempP=s.p();
		while(tempP-p>=error||tempP-p<=-error){
			if(tempP>p){
				if(isLess==true){
					isLess=false;
					d=d/2;
				}
				isMore=true;
				s.x=s.x-d;
			}else{
				if(isMore==true){
					isMore=false;
					d=d/2;
				}
				isLess=true;
				s.x=s.x+d;
			}
			tempP=s.p();
		}
		return s.x;
	}
	/*********Method End*********/
	
}
/*********Class End*********/
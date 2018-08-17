package homeWork1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/***************************
/*Program Assignment:Calculate the mean and standard deviation.       
/*Author: SJZ                              
/*Date: 2017/7/10                   
/*Description: Read a column in a file and calculate the mean and standard deviation.              
/***************************/

/**************************
/* Listing Contents:                                                                               
/*    Reuse instructions: null                                                                                            
/*    Modification instructions: null                                                                                   
/*    Compilation instructions: null                                                                                    
/*                                                                     
/**************************/

/*********Class Head**********
/*Class Name: Calculate
/*Member Variable: null           
/*Method: double[] getColumn(String name), double toStd_Dev(String name), double toMean(String name),                    
/***************************/
public class Calculate {

	/*********Method Head*********
	/*Method name: getColumn
	*/
	public double[] getColumn(String name){
		//根据文件得到长度为n的double数组
		double[]result;
		String[]resultStr;
		File f=new File(name);
		int count=0;
		String column="";
		try {
			FileReader fr=new FileReader(f);
			BufferedReader bf=new BufferedReader(fr);
			String temp=bf.readLine();
			while(temp!=null){
				column+=temp+" ";
				temp=bf.readLine();
				count++;
			}
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		
		resultStr=column.split(" ");
		column="";
		result=new double[count];
		for(int n=0;n<count;n++){
			result[n]=Double.parseDouble(resultStr[n]);
		}
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: toStd_Dev
	*/
	public double toStd_Dev(String name){
		//求出文件对应的标准差
		
		double result=0.0;
		double[]temp=getColumn(name);
		double mean=toMean(name);
		int N=0;
		for(double d:temp){
			result+=(mean-d)*(mean-d);
			N++;
		}
		result=result/(N-1);
		
		result=Math.sqrt(result);
		
		return result;
	}
	/*********Method End*********/
	
	/*********Method Head*********
	/*Method name: toMean
	*/
	public double toMean(String name){
		
		//求出文件对应的平均数
		
		double result=0;
		double[]temp=getColumn(name);
		double count=0;
		int N=0;
		for(double d:temp){
			count+=d;
			N++;
		}
		result=count/N;
		return result;
	}
	/*********Method End*********/
}
/*********Class End*********/
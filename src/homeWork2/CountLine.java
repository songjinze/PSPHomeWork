package homeWork2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/***************************
/*Program Assignment: Count the number of code in one file.
/*Author: SJZ
/*Date: 2017/7/11
/*Description:Read a file and count the number of line. 
/***************************/

/***************************
/* Listing Contents:                                                                               
/*    Reuse instructions: null                                                                                           
/*    Modification instructions: null                                                                                 
/*    Compilation instructions: null
/***************************/

/*********Class Head**********
/*Class Name: CountLine
/*Member Variable:File f, FileReader fr, BufferedReader bf.
/*Method:void getFile(String path),void count().
/***************************/
public class CountLine {

	File f;
	FileReader fr;
	BufferedReader bf;
	
/*********Method Head*********
/*Method name:getFile
*/
	public void getFile(String path){
		f=new File(path);
		try {
			fr=new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
/*********Method End*********/
	
/*********Method Head*********
/*Method name:count
*/
	public void count(){
		String className=null;
		int classLineNum=0;	
		String methodName=null;
        int methodLineNum=0;
		boolean enterClass=false;
		boolean enterMethod=false;
		
        bf=new BufferedReader(fr);
		String tempLine;
		try {
			tempLine = bf.readLine();
			while(tempLine!=null){
				tempLine=tempLine.replace(" ", "");
				tempLine=tempLine.replaceAll("	", "");
				
				if(tempLine.equals("")||tempLine.startsWith("import")||tempLine.startsWith("package")){
					tempLine=bf.readLine();
					continue;
				}
				else if(tempLine.startsWith("//")||tempLine.startsWith("/*")||tempLine.startsWith("*")){
					if(tempLine.contains("ClassHead")){
						enterClass=true;
						tempLine=bf.readLine();
						className=tempLine.split(":")[1];
					}
					else if(tempLine.contains("ClassEnd")){
						enterClass=false;
						System.out.println(className+" : "+classLineNum+" lines.");
						className=null;
						classLineNum=0;
					}
					else if(tempLine.contains("MethodHead")){
						enterMethod=true;
						tempLine=bf.readLine();
						methodName=tempLine.split(":")[1];
					}
					else if(tempLine.contains("MethodEnd")){
						enterMethod=false;
						System.out.println(methodName+" in class "+className+" : "+methodLineNum+" lines.");
						methodName=null;
						methodLineNum=0;
					}
				}
				else{
					if(enterMethod){
						classLineNum++;
						methodLineNum++;
					}
					else if(enterClass){
						classLineNum++;
					}
					else
						classLineNum++;
				}
				tempLine=bf.readLine();
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
  /*********Method End*********/	
}
/*********Class End*********/
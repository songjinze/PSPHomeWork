package homeWork2;

public class CountLineTest {

	public static void main(String[]args){
		CountLine cl=new CountLine();
		cl.getFile("src/homeWork2/CountLine.java");
		//cl.count();
		CountLine cl2=new CountLine();
		cl2.getFile("src/homeWork1/Calculate.java");
		//cl2.count();
		CountLine cl3=new CountLine();
		cl3.getFile("src/homeWork3/Calculate3.java");
		//cl3.count();
		CountLine cl4=new CountLine();
		cl4.getFile("src/homeWork4/Ranges.java");
		//cl4.count();
		CountLine cl5=new CountLine();
		cl5.getFile("src/homeWork5/Simpson.java");
		//cl5.count();
		CountLine cl6=new CountLine();
		cl6.getFile("src/homeWork6/SearchAlgorithm.java");
		//cl6.count();
		CountLine cl7=new CountLine();
		cl7.getFile("src/homeWork7/CalculateNumbers.java");
		//cl7.count();
		CountLine cl8=new CountLine();
		cl8.getFile("src/homeWork8/EquationSet.java");
		cl8.count();
	}
}

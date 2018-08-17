package homeWork8;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquationSetTest {

	String w1="src/homeWork8/w1";
	String x1="src/homeWork8/x1";
	String y1="src/homeWork8/y1";
	String z1="src/homeWork8/z1";
	
	String w2="src/homeWork8/w2";
	String x2="src/homeWork8/x2";
	String y2="src/homeWork8/y2";
	String z2="src/homeWork8/z2";
	EquationSet es=new EquationSet();
	@Test
	public void test1() {
		es.name1=w1;
		es.name2=x1;
		es.name3=y1;
		es.name4=z1;
		es.wk=185;
		es.xk=150;
		es.yk=45;
		double[]B=es.getB();
		assertEquals(0.56645,B[0],0.0001);
		assertEquals(0.06533,B[1],0.0001);
		assertEquals(0.008719,B[2],0.0001);
		assertEquals(0.15105,B[3],0.0001);
		assertEquals(20.76,es.getPH(),0.01);
		assertEquals(26.89,es.getUPI(),0.01);
		assertEquals(14.63,es.getLPI(),0.01);
	}
	@Test
	public void test2() {
		es.name1=w2;
		es.name2=x2;
		es.name3=y2;
		es.name4=z2;
		es.wk=650;
		es.xk=3000;
		es.yk=155;
		double[]B=es.getB();
		assertEquals(6.7013,B[0],0.0001);
		assertEquals(0.0784,B[1],0.0001);
		assertEquals(0.0150,B[2],0.0001);
		assertEquals(0.2461,B[3],0.0001);
		assertEquals(140.9,es.getPH(),0.1);
		assertEquals(179.7,es.getUPI(),0.1);
		assertEquals(102.1,es.getLPI(),0.1);
	}

}

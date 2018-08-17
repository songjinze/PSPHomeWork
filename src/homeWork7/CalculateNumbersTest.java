package homeWork7;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateNumbersTest {

	CalculateNumbers c=new CalculateNumbers();
	String name1="src/homeWork7/EstimatedProxySize";
	String name2="src/homeWork7/ActualAddedAndModifiedSize";
	String name3="src/homeWork7/ActualDevelopmentHours";
	String name4="src/homeWork7/PlanAddedAndModifiedSize";
	
	String name5="src/homeWork7/E_P_S";
	String name6="src/homeWork7/P_A&M";
	String name7="src/homeWork7/A_A&M";
	String name8="src/homeWork7/A_T";
	@Test
	public void test1() {
		c.name1=name1;
		c.name2=name2;
		c.xk=386;
		assertEquals(0.954496574,c.getRxy(),0.000001);
		assertEquals(0.91106371,c.getRSequare(),0.000001);
		assertEquals(1.77517E-05,c.getTailArea(),0.000001);
		assertEquals(-22.55253275,c.getB0(),0.000001);
		assertEquals(1.727932426,c.getB1(),0.000001);
		assertEquals(644.4293838,c.getYk(),0.000001);
		assertEquals(230.0017197,c.getRange(0.35, c.name1, c.name2),0.0001);
		assertEquals(874.4311035,c.getUPI(),0.0001);
		assertEquals(414.427664,c.getLPI(),0.0001);
	}

	@Test
	public void test2() {
		c.name1=name1;
		c.name2=name3;
		c.xk=386;
		assertEquals(0.933306898,c.getRxy(),0.000001);
		assertEquals(0.871061766,c.getRSequare(),0.000001);
		assertEquals(7.98203E-05,c.getTailArea(),0.000001);
		assertEquals(-4.038881575,c.getB0(),0.000001);
		assertEquals(0.16812665,c.getB1(),0.000001);
		assertEquals(60.85800528,c.getYk(),0.000001);
		assertEquals(27.55764748,c.getRange(0.35, c.name1, c.name2),0.00001);
		assertEquals(88.41565276,c.getUPI(),0.0001);
		assertEquals(33.3003578,c.getLPI(),0.0001);
		
	}
	
	@Test
	public void test3() {
		c.name1=name5;
		c.name2=name7;
		c.xk=31.68;
		c.c.xk=31.68;
		assertEquals(0.006507869,c.getRSequare(),0.000001);
		assertEquals(34.59311742,c.getB0(),0.000001);
		assertEquals(0.156684144,c.getB1(),0.000001);
		assertEquals(31.82900265,c.getRange(0.35, c.name1, c.name2),0.00001);
		assertEquals(71.38587375,c.getUPI(),0.0001);
		assertEquals(7.727868447,c.getLPI(),0.0001);
		
	}
	
	@Test
	public void test4() {
		c.name1=name5;
		c.name2=name8;
		c.xk=31.68;
		c.c.xk=31.68;
		assertEquals(0.481210334,c.getRSequare(),0.0001);
		
		assertEquals(177.7747004,c.getB0(),0.001);
		assertEquals(-4.08860623,c.getB1(),0.001);
		
		assertEquals(69.79730130,c.getRange(0.35, c.name1, c.name2),0.001);
		assertEquals(118.044415,c.getUPI(),0.0001);
		assertEquals(0,c.getLPI(),0.0001);
		
	}
}

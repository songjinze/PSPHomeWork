package homeWork3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculate3Test {

	Calculate3 c=new Calculate3();
	String name1="src/homeWork3/EstimatedProxySize";
	String name2="src/homeWork3/PlanAddedAndModifiedSize";
	String name3="src/homeWork3/ActualAddedAndModifiedSize";
	String name4="src/homeWork3/ActualDevelopmentHours";
	double[]expected1={-22.55,1.7279,0.9545,0.9111,644.429};
	double[]expected2={-4.039,0.1681,0.9333,0.8711,60.858};
	double[]expected3={-23.92,1.43097,0.9631,0.9276,528.4294};
	double[]expected4={-4.604,0.140164,0.9480,0.8988,49.4994};
	
	@Test
	public void test1() {
	    assertEquals(expected1[0],c.beta0(name1, name3),0.01);
		
	}
	
	@Test
	public void test2() {
		assertEquals(expected1[1],c.beta1(name1, name3),0.01);
	}
	
	@Test
	public void test3() {
		assertEquals(expected1[2],c.rxy(name1, name3),0.01);
	}
	
	@Test
	public void test4() {
		assertEquals(expected1[3],c.rSquare(name1, name3),0.01);
	}
	@Test
	public void test5() {
		assertEquals(expected1[4],c.yk(name1, name3),0.01);
	}
	@Test
	public void test6() {
	    assertEquals(expected2[0],c.beta0(name1, name4),0.01);
		
	}
	
	@Test
	public void test7() {
		assertEquals(expected2[1],c.beta1(name1, name4),0.01);
	}
	
	@Test
	public void test8() {
		assertEquals(expected2[2],c.rxy(name1, name4),0.01);
	}
	
	@Test
	public void test9() {
		assertEquals(expected2[3],c.rSquare(name1, name4),0.01);
	}
	@Test
	public void test10() {
		assertEquals(expected2[4],c.yk(name1, name4),0.01);
	}
	@Test
	public void test11() {
	    assertEquals(expected3[0],c.beta0(name2, name3),0.01);
		
	}
	
	@Test
	public void test12() {
		assertEquals(expected3[1],c.beta1(name2, name3),0.01);
	}
	
	@Test
	public void test13() {
		assertEquals(expected3[2],c.rxy(name2, name3),0.01);
	}
	
	@Test
	public void test14() {
		assertEquals(expected3[3],c.rSquare(name2, name3),0.01);
	}
	@Test
	public void test15() {
		assertEquals(expected3[4],c.yk(name2, name3),0.01);
	}
	@Test
	public void test16() {
	    assertEquals(expected4[0],c.beta0(name2, name4),0.01);
		
	}
	
	@Test
	public void test17() {
		assertEquals(expected4[1],c.beta1(name2, name4),0.01);
	}
	
	@Test
	public void test18() {
		assertEquals(expected4[2],c.rxy(name2, name4),0.01);
	}
	
	@Test
	public void test19() {
		assertEquals(expected4[3],c.rSquare(name2, name4),0.01);
	}
	@Test
	public void test20() {
		assertEquals(expected4[4],c.yk(name2, name4),0.01);
	}
	
	
}

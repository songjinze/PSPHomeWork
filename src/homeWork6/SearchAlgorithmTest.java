package homeWork6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchAlgorithmTest {

	SearchAlgorithm s=new SearchAlgorithm();
	@Test
	public void test1() {
		s.p=0.20;
		s.dof=6;
		assertEquals(0.55338,s.getX(),0.0001);
	}
	@Test
	public void test2() {
		s.p=0.45;
		s.dof=15;
		assertEquals(1.75305,s.getX(),0.0001);
	}
	@Test
	public void test3() {
		s.p=0.495;
		s.dof=4;
		assertEquals(4.60409,s.getX(),0.0001);
	}
}

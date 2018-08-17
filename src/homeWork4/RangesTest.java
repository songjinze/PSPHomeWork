package homeWork4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangesTest {

	String path1="src/homeWork4/LOC_Method";
	String path2="src/homeWork4/Pgs_Chapter";
	Ranges r1=new Ranges(path1);
	Ranges r2=new Ranges(path2);
	@Test
	public void test1() {
		assertEquals(4.3953,r1.vs(),0.0001);
	}
	@Test
	public void test2() {
		assertEquals(8.5081,r1.s(),0.0001);
	}
	@Test
	public void test3() {
		assertEquals(16.4696,r1.m(),0.0001);
	}
	@Test
	public void test4() {
		assertEquals(31.8811,r1.l(),0.0001);
	}
	@Test
	public void test5() {
		assertEquals(61.7137,r1.vL(),0.0001);
	}
	@Test
	public void test6() {
		assertEquals(6.3375,r2.vs(),0.0001);
	}
	@Test
	public void test7() {
		assertEquals(8.4393,r2.s(),0.0001);
	}
	@Test
	public void test8() {
		assertEquals(11.2381,r2.m(),0.0001);
	}
	
	@Test
	public void test9() {
		assertEquals(14.9650,r2.l(),0.0001);
	}
	@Test
	public void test10() {
		assertEquals(19.9280,r2.vL(),0.0001);
	}
}

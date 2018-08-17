package homeWork5;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpsonTest {

	Simpson s1=new Simpson();
	@Test
	public void test1() {
		s1.dof=9;
		s1.x=1.1;
		assertEquals(0.35006,s1.p(),0.0001);
	}
	@Test
	public void test2() {
		s1.dof=10;
		s1.x=1.1812;
		assertEquals(0.36757,s1.p(),0.0001);
	}
	@Test
	public void test3() {
		s1.dof=30;
		s1.x=2.750;
		assertEquals(0.49500,s1.p(),0.0001);
	}

}

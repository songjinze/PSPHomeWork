package homeWork1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	Calculate c=new Calculate();
	@Test
	public void testColumn1Mean(){
		assertEquals(550.6, c.toMean("src/homeWork1/Column1"), 0.1);
	}
	@Test
	public void testColumn1Std_Dev(){
		assertEquals(572.03,c.toStd_Dev("src/homeWork1/Column1"),0.01);
	}
    @Test
    public void testColumn2Mean(){
    	assertEquals(60.32,c.toMean("src/homeWork1/Column2"),0.01);
    }
    @Test
	public void testColumn2Std_Dev(){
		assertEquals(62.26,c.toStd_Dev("src/homeWork1/Column2"),0.01);
	}
}

package org.globallogic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class MathUtilsTest {

	@BeforeEach
	public void init() {
		Mathutils mathutil = new Mathutils();
	}
	
	@Test
	public void testadd() {
		Mathutils mathutil=new Mathutils();
		
		int expected=20;
		int actual=mathutil.add(10, 10);
		assertEquals(expected,actual);
	}
	@Test
	public void testdivide() {
		final Mathutils mathutil=new Mathutils();
		
		assertThrows(ArithmeticException.class,()-> mathutil.div(10, 0));
		
	}
	@Test
	public void testsub() {
		Mathutils mathutil=new Mathutils();
		
		int expected=0;
		int actual=mathutil.sub(10, 10);
		assertEquals(expected,actual);
	}
	@Test
	public void testmul() {
		Mathutils mathutil=new Mathutils();
		
		int expected=100;
		int actual=mathutil.mul(10, 10);
		assertEquals(expected,actual);
	}
	

}

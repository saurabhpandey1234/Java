package org.globallogic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Mathutil2 {
	@Test
	 public void addition() {
		Mathutils test= new Mathutils();
		int expected=10;
		int actual=test.add(5, 5);
		assertEquals(actual,expected);
	}
	@Test
	 public void subtraction() {
		Mathutils test= new Mathutils();
		int expected=0;
		int actual=test.sub(5, 5);
		assertEquals(actual,expected);
	}
	
	
	
}

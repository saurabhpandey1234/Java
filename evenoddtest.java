package org.globallogic;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class evenoddtest {

	@Test
	public void evenoddt() {
		EvenOdd eo=new EvenOdd();
		int num1=5;
		int expected=0;
		int actual=eo.evenodd(num1);
		assertEquals(actual,expected);
	}
	
}

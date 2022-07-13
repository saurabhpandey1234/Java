package unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTestingimpl {
 
	@Test
	public void add_twoplustwo_returnfour() {
		final int expected=5;
		//final int actual=Math.subtractExact(8, 3);
		final int actual=Math.addExact(2, 3);
		assertEquals(actual,expected);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("single unit implement");
		System.out.println("testing wnet good");
	}

}

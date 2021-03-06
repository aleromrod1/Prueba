package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Multiply;

public class TestMultiply {

	@Test
	public void testMultiply() {
		assertEquals(4, Multiply.multiply(2, 2));
	}
	
	@Test
	public void testMultiply2() {
		assertEquals(2, Multiply.multiply(1,1, 2));
	}
	
	@Test
	public void testMultiplyNumWithZero() {
		assertEquals(0, Multiply.multiply(3, 0));
		assertEquals(0, Multiply.multiply(0, 3));
	}
	
	@Test
	public void testMultiplyNumNeg() {
		assertEquals(-6, Multiply.multiply(-3, 2));
		assertEquals(-15, Multiply.multiply(5, -3));
	}
	
	@Test(expected=AssertionError.class)
	public void testMultiplyFail() {
		assertEquals(5, Multiply.multiply(2, 2));
	}
	
	@Test(expected=AssertionError.class)
	public void tesMultiply2Fail() {
		assertEquals(3, Multiply.multiply(1,1, 2));
	}
	

}

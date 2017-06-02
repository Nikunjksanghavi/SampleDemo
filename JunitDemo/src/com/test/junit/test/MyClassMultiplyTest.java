package com.test.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.test.junit.src.MyClass;

/**
 * @author nikunj_sanghavi
 * Referring http://www.vogella.com/tutorials/JUnit/article.html
 */
public class MyClassMultiplyTest {

	/**
	 * before all test
	 */
	@BeforeClass
	public static void beforeClass(){
		System.out.println("BeforeClass is called");
	}
	
	/**
	 * after all test
	 */
	@AfterClass
	public static void afterClass(){
		System.out.println("AfterClass is Called");
	}
	
	
	/**
	 * before each test
	 */
	@Before
	public void before(){
		System.out.println("Before is called");
	}
	
	/**
	 * after each test
	 */
	@After
	public void after(){
		System.out.println("After is Called");
	}
	
	/**
	 * 
	 */
	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		MyClass tester = new MyClass(); // MyClass is tested

		// assert statements
		assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
		assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
		assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
		assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
		
		System.out.println(System.getProperties());
	}
}
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
public class MyClassDivideTest {

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
	 * timeout is 1ms
	 */
	//@Ignore("Exception is comming")
	@Test(timeout = 1)
	public void divisionTest() {
		MyClass tester = new MyClass(); // MyClass is tested

		// assert statements
		assertEquals("154653210 / 7 must be 220459077", 220459077, tester.divide(1543213540, 7));
		assertEquals("0 / 10 must be 0", 0, tester.divide(0, 10));
		assertEquals("0 / 0 must be 0", 0, tester.divide(0, 0));
		assertEquals("10 / 5 must be 2", 2, tester.divide(10, 5));
	}
}
package com.test.junit.src;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.test.junit.test.MyClassMultiplyTest;

/**
 * @author nikunj_sanghavi
 *
 */
public class JunitDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Result result = JUnitCore.runClasses(MyClassMultiplyTest.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	}
}
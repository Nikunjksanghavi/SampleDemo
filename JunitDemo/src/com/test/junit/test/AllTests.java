package com.test.junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyClassMultiplyTest.class, MyClassDivideTest.class })
public class AllTests {

}

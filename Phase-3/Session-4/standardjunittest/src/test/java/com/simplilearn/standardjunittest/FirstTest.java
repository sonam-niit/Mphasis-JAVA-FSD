package com.simplilearn.standardjunittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("First Testdemo")
@RunWith(JUnitPlatform.class)
public class FirstTest {

	Calculator cal=null;
	@BeforeAll
	static void setUpforAll()
	{
		System.out.println("Call before All Tests");
	}
	@AfterAll
	static void tearDownForAll()
	{
		System.out.println("Call After All tests");
	}
	@BeforeEach
	void setUp()
	{
		cal= new Calculator();
		System.out.println("Object created");
	}
	@AfterEach
	void tearDown()
	{
		cal=null;
		System.out.println("object Destroyed");
	}
	@Disabled
	@Test
	void addMethod1()
	{
		System.out.println("Add test executed");
		assertEquals(9, cal.add(5, 4));
	}
	@Disabled
	@Test
	void addMethod2()
	{
		System.out.println("Add test Executed");
		Calculator cal= new Calculator();
		assertNotEquals(7, cal.add(5, 4));
	}
}

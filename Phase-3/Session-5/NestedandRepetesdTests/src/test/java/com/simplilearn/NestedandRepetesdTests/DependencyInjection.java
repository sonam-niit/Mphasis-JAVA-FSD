package com.simplilearn.NestedandRepetesdTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Dependency Injection Example")
public class DependencyInjection {

	public DependencyInjection(TestInfo testInfo) {
		Assertions.assertEquals("Dependency Injection Example", testInfo.getDisplayName());
	}
	
	@Test
	@DisplayName("Another Test")
	public void myTest(TestInfo testInfo)
	{
		Assertions.assertEquals("Another Test", testInfo.getDisplayName());
	}
	
	@Test
	@DisplayName("Test 1")
	@Tag("my-tag")
	public void myTest1(TestInfo testInfo)
	{
		Assertions.assertEquals("Test 1", testInfo.getDisplayName());
		Assertions.assertTrue(testInfo.getTags().contains("my-tag"));
	}
}

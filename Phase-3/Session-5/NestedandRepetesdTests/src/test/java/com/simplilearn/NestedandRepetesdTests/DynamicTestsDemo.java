package com.simplilearn.NestedandRepetesdTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class DynamicTestsDemo {

	@TestFactory
	Collection<DynamicTest>  dynamicTests()
	{
		return Arrays.asList(
				dynamicTest("Test 1",()->{assertTrue(true);}),
				dynamicTest("Test 2", ()->assertEquals(5, 2+3)),
				dynamicTest("Test 3", ()->assertFalse(9<1)),
				dynamicTest("Test 4", 
						()->{assertThrows(RuntimeException.class,()->{throw new RuntimeException();});}),
				dynamicTest("Test 5", new MyExecutable())
				);
	}
}

class MyExecutable implements Executable
{
	@Override
	public void execute() throws Throwable {
		System.out.println("My Executable Class");
		
	}
	
}

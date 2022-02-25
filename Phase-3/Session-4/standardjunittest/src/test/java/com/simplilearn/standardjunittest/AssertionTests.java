package com.simplilearn.standardjunittest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Assertions Demo")
@RunWith(JUnitPlatform.class)
public class AssertionTests {

	@Test
	void test()
	{
		int a=67;
		int b=89;
		assertFalse(5>8);
		assertTrue(b>a);
		assertTrue(checkAge(78));
		
		String str=null;
		
		assertNull(str);
		assertNotNull("hello");
		
		assertEquals(8, 2+6);
		
		//pass function as a parameter //lambda expression (>=1.8)
		assertThrows(RuntimeException.class, ()->{throw new RuntimeException();});
	}
	
	boolean checkAge(int age)
	{
		return age>=18;
	}
}

package com.simplilearn.standardjunittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Conditionals Test")
@RunWith(JUnitPlatform.class)
public class ConditionalOSTest {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows()
	{
		System.out.println("This runs on Windows");
	}
	
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMac()
	{
		System.out.println("This runs on MAC");
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux()
	{
		System.out.println("This runs on Linux");
	}
}

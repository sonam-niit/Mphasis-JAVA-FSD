package com.simplilearn.NestedandRepetesdTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTests {

	private Calculator calc=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		calc=new Calculator();
		System.out.println("SetUp before Each Test");
	}

	@AfterEach
	void tearDown() throws Exception {
		calc=null;
		System.out.println("Destroy After Each Test");
	}

	@Test
	@DisplayName("Add operation test")
	@RepeatedTest(value = 5,name = "Testcase: {displayName} the currentCount is"
			+ " {currentRepetition} out of {totalRepetitions}")
	void addMethod() {
		assertEquals(8, calc.add(6, 2),"6+2 should equal to 8");
		System.out.println("===== test passed =====");
	}

}

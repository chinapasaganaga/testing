package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Test
	private void fashion() {
	System.out.println("Fashion");
	}
	@Test
	private void furniture() {
    System.out.println("Furniture");
	}
	@Test
	private void flights() {
    System.out.println("Flights");
	}
	@Ignore
	@Test
	private void beauty() {
	System.out.println("Beauty");
	}
	@Test(enabled = false)
	private void grocery() {
    System.out.println("Grocery");
	}

}

package com.testng;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	private void username() {
    System.out.println("AbinayaMari");
	}
	@Test(priority = 3)
	private void login() {
    System.out.println("click login");
	}
	@Test(priority = 2)
	private void password() {
    System.out.println("abimari29");
	}
	@Test
	private void url() {
    System.out.println("https://adactinhotelapp.com/");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	private void registerAccount() {
//     System.out.println("Register your Account");
//	}
//	@Test(priority = 2)
//	private void sentEmail() {
//    System.out.println("Send email after login");
//	}
//	@Test(priority = 1)
//	private void login() {
//    System.out.println("Login to the account after registration");
//	}
//
//}
}
 
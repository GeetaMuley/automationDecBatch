
package com.testNG.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
@Test
public void TC01() {
	System.out.println("TC01 is executed");
}
@Test
public void TC02() {
	System.out.println("TC02 is executed");
}
@Test
public void TC03() {
	System.out.println("TC03 is executed");
}
@BeforeMethod
public void login() {
	System.out.println("Application login");
}
@AfterMethod
public void logout() {
	System.out.println("Application logout");
}
@BeforeClass
public void launchBrowser() {
	System.out.println("Browser opened");
}
@AfterClass
public void closeBrowser() {
	System.out.println("Browser closed");
}
}

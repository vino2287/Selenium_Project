package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}

}

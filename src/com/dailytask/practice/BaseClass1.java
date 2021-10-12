package com.dailytask.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {

	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {
		try {
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				WebDriver driver = new ChromeDriver();
			} else if (browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\firefoxdriver.exe"));
				WebDriver driver = new FirefoxDriver();
			} else if (browserName.equals("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + ("\\Driver\\edgedriver.exe"));
				WebDriver driver = new EdgeDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
		
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void inputElement(WebElement element, String value) {
		element.sendKeys(value);
	}
}

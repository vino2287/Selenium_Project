package com.selenium.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement Image = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[10]"));
		Image.click();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.switchTo().frame("frame2");
		Thread.sleep(3000);
		driver.findElement(By.id("Click1")).click();		
		
	}

}

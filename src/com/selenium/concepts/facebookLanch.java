package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookLanch {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("7401320870");
		
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Jan@2019");
		
		boolean enabled = password.isEnabled();
		System.out.println(enabled);

		WebElement logIn = driver.findElement(By.id("u_0_d_sk"));
		logIn.click();
		
		boolean selected = logIn.isSelected();
		System.out.println(selected);
		// Thread.sleep(3000);
		// WebElement date = driver.findElement(By.id("day"));
		// WebElement month = driver.findElement(By.id("month"));
		// WebElement year = driver.findElement(By.id("year"));
		// Select sc = new Select(date);
		// sc.selectByIndex(10);
		// Thread.sleep(3000);
		// Select sc1 = new Select(month);
		// sc1.selectByValue("7");
		// Thread.sleep(3000);
		// Select sc2 = new Select(year);
		// sc2.selectByVisibleText("2019");
	}

}

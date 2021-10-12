package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sangeethamobiles.com/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[@href='javascript:void(0);']"))).build().perform();

		Thread.sleep(3000);

		WebElement Brands = driver.findElement(By.xpath("//td[@class='Apple']"));
		Brands.click();

		Thread.sleep(3000);

		WebElement search = driver.findElement(By.id("searchData"));
		search.sendKeys("apple watch");

		WebElement click = driver.findElement(By.id("searchDataIcon"));
		click.click();

	}

}

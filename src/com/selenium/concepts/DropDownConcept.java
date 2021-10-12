package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DropDownConcept extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		getDriver("chrome");
		getUrl("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		selection(driver.findElement(By.id("day")), "byIndex", "5");
		selection(driver.findElement(By.id("month")), "byValue", "5");
		selection(driver.findElement(By.id("year")), "byVisibleText", "2020");

	}
}

package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
	private WebDriver driver;

	public POMClass(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstPage() {
		return firstPage;
	}

	@FindBy(xpath= "//a[@class='login']")
	private WebElement firstPage;

}

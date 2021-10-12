package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass6 {
	private WebDriver driver;

	public POMClass6(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed() {
		return proceed;
	}

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed;

}

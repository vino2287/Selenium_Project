package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass5 {
	private WebDriver driver;

	public POMClass5(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCart() {
		return cart;
	}

	@FindBy(xpath="//button[@name='Submit']")
	private WebElement cart;

}

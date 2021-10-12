package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass8 {
	private WebDriver driver;

	public POMClass8(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddress() {
		return Address;
	}

	@FindBy(xpath="//textarea[@name='message']")
	private WebElement Address;

}

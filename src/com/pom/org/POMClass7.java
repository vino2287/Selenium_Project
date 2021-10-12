package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass7 {
	private WebDriver driver;

	public POMClass7(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}

	@FindBy(xpath= "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement CheckOut;

}

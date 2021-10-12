package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass3 {

	private WebDriver driver;

	public POMClass3(WebDriver driver1) {
		this.driver = driver1;

		PageFactory.initElements(driver, this);
	}

	public WebElement getDressView() {
		return dressView;
	}

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement dressView;

}

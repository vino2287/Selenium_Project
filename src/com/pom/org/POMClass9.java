package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass9 {
	private WebDriver driver;

	public WebElement getProcessAddress() {
		return processAddress;
	}

	public POMClass9(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "processAddress")
	private WebElement processAddress;

}

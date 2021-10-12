package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass4 {
	
	private WebDriver driver;

	public POMClass4(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddCart() {
		return addCart;
	}

	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement addCart;
	
	

}

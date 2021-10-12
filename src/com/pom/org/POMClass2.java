package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass2 {
	private WebDriver driver;

	public POMClass2(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	@FindBy(linkText ="CASUAL DRESSES")
	private WebElement dress;
	
	

}

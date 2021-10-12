package com.selenium.concepts;

import java.io.IOException;

public class ScreenShotDemo extends BaseClass {

	public static void main(String[] args) throws IOException {
		getDriver("chrome");
		getUrl("https://www.flipcart.com/");
		screenshot("C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\SrceenShot\\flipcart.png");

	}

}

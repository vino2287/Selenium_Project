package com.selenium.concepts;

public class InternetLaunch extends BaseClass {

	public static void main(String[] args) {
		getDriver("ie");
		getUrl("https://www.facebook.com/");
	}
}

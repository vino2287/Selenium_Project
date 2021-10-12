package com.selenium.concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {

			WebElement links = list.get(i);

			String url = links.getAttribute("href");

			verifyLinksActive(url);

		}

	}

	public static void verifyLinksActive(String linksurl) {

		try {
			URL url = new URL(linksurl);

			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();

			httpUrlConnection.connect();

			if (httpUrlConnection.getResponseCode() == 200) {

				System.out.println(linksurl + "-" + httpUrlConnection.getResponseCode());

			} else if (httpUrlConnection.getResponseCode() > 400) {

				System.out.println(
						linksurl + "-" + httpUrlConnection.getResponseCode() + "-" + httpUrlConnection.HTTP_NOT_FOUND);

			}

		} catch (Exception e) {
		}
	}

}

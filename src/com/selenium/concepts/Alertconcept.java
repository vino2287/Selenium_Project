package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertconcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement alerkOk = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alerkOk.click();
		Thread.sleep(3000);

		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button.click();
		Thread.sleep(5000);

		driver.switchTo().alert().accept();

		WebElement alertCancel = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alertCancel.click();
		Thread.sleep(3000);

		WebElement display = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		display.click();
		Thread.sleep(5000);

		driver.switchTo().alert().accept();
		WebElement show = driver.findElement(By.xpath(("(//a[@class='analystic'])[3]")));
		show.click();
		Thread.sleep(3000);

		WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		prompt.click();
		Thread.sleep(5000);

		driver.switchTo().alert().sendKeys("Kirthika Lusu");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}

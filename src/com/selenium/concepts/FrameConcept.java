package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		WebElement SingleFrame = driver.findElement(By.xpath("//a[@data-toggle='tab']"));
		SingleFrame.click();
		Thread.sleep(3000);

		driver.switchTo().frame(0);

		WebElement TextBox = driver.findElement(By.xpath("//input[@type='text']"));
		TextBox.sendKeys("Iam a boy");
		Thread.sleep(3000);

		driver.switchTo().parentFrame();

		WebElement Iframe = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		Iframe.click();

		WebElement Multiple = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(Multiple);
		Thread.sleep(3000);

		WebElement Multilevel = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(Multilevel);
		Thread.sleep(3000);

		WebElement TypeBox = driver.findElement(By.xpath("//input[@type='text']"));
		TypeBox.sendKeys("Iam a loosu");

		driver.switchTo().defaultContent();

	}

}

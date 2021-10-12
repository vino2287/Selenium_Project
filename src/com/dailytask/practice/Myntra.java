package com.dailytask.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver dr = new ChromeDriver(opt);
		dr.get("https://www.myntra.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action = new Actions(dr);
		action.moveToElement(dr.findElement(By.xpath("//a[text()='Women']"))).build().perform();
		// Thread.sleep(3000);

		dr.findElement(By.xpath("//a[text()='Jackets & Coats']")).click();

		// Thread.sleep(3000);

		String text = dr.findElement(By.className("title-count")).getText();

		System.out.println(text);

		dr.findElement(By.xpath("//*[text()='Coats']")).click();

		// Thread.sleep(3000);

		dr.findElement(By.className("brand-more")).click();

		WebElement brand = dr.findElement(By.xpath("//*[@placeholder='Search brand']"));
		brand.sendKeys("MANGO");

		// Thread.sleep(3000);

		dr.findElement(By.xpath("(//*[text()='MANGO'])[2]")).click();

		// Thread.sleep(3000);

		dr.findElement(By.xpath("//*[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();

		List<WebElement> list = dr.findElements(By.xpath("//*[text()='Brand']"));

		for (WebElement type : list) {
			if (type.getText().equals("Mango")) {

			}
			System.out.println(type.getText());
		}

	}

}

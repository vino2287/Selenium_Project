package com.dailytask.practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.nykaa.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions action = new Actions(dr);

		action.moveToElement(dr.findElement(By.xpath("//a[text()='brands']"))).build().perform();

		Thread.sleep(3000);

		WebElement brand = dr.findElement(By.xpath("//a[text()='Popular']"));
		brand.click();

		Thread.sleep(3000);

		WebElement paris = dr.findElement(By.xpath("//*[@id=\"brandCont_Popular\"]/ul/li[5]/a"));
		paris.click();

		Thread.sleep(3000);

		Set<String> title = dr.getWindowHandles();
		for (String st : title) {
			String title2 = dr.switchTo().window(st).getTitle();
			if (dr.getTitle().contains("L'Oreal Paris")) {
				System.out.println(title2);
			}
		}
		dr.findElement(By.xpath("//*[@class='sort-wrapper closed']")).click();

		Thread.sleep(3000);

		WebElement top = dr.findElement(By.xpath("//*[text()='customer top rated']"));
		top.click();

		Thread.sleep(3000);

		WebElement cate = dr.findElement(By.xpath("//*[text()='Category']"));
		cate.click();

		Thread.sleep(3000);
//
//		WebElement shamp = dr.findElement(By.xpath("//*[text()='Shampoo (16)']"));
//		shamp.click();
//
//		List<WebElement> list = dr.findElements(By.xpath("//*[text()='filters applied']"));
//		for (WebElement filter : list) {
//			if (filter.getText().contains("Shampoo")) {
//			}
//			System.out.println(filter.getText());
//
//		}
//
//		Thread.sleep(3000);
//
//		WebElement shampoo = dr.findElement(By.xpath(
//				"//*[@id=\"listingContainer\"]/div[3]/div/div/div[2]/div/div/div[4]/div/a/div/div[1]/div/div/img"));
//		shampoo.click();
//
//		Thread.sleep(3000);
//
//		WebElement ml = dr.findElement(By.xpath("(//*[@class='size-pallets'])[2]"));
//		ml.click();
	}

}

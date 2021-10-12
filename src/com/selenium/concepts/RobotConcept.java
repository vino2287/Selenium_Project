package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotConcept extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions ac = new Actions(driver);

		WebElement Best = driver.findElement(By.linkText("Best Sellers"));
		ac.contextClick(Best).build().perform();
		Robot rb = new Robot();
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		WebElement Gift = driver.findElement(By.xpath("//a[text()='Gift Ideas	']"));
		ac.contextClick(Gift).build().perform();
		Robot rb1 = new Robot();
		rb1.keyPress(KeyEvent.VK_DOWN);
		rb1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		WebElement New = driver.findElement(By.xpath("//a[text()='New Releases']"));
		ac.contextClick(New).build().perform();
		Robot rb2 = new Robot();
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		WebElement Today = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		ac.contextClick(Today).build().perform();
		Robot rb3 = new Robot();
		rb3.keyPress(KeyEvent.VK_DOWN);
		rb3.keyPress(KeyEvent.VK_ENTER); 

		Set<String> all_id = driver.getWindowHandles();

		for (String st : all_id) {
			System.out.println(st);
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);
		}

		String actualTitle = "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		for (String st : all_id) {
			if (driver.switchTo().window(st).getTitle().equals(actualTitle)) {
				break;
			}
		}
		driver.close();
	}

}

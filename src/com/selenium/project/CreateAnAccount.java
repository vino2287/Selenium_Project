package com.selenium.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		Signin.click();

		WebElement EmailAddress = driver.findElement(By.id("email_create"));
		EmailAddress.sendKeys("aarthyraja10@gmail.com");

		WebElement CreateAccount = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		CreateAccount.click();
		//Thread.sleep(3000);
		WebElement Title = driver.findElement(By.id("id_gender2"));
		Title.click();
		//Thread.sleep(3000);
//		WebElement FirstName = driver.findElement(By.id("customer_firstname"));
//		FirstName.sendKeys("Vinoth");
//		WebElement LastName = driver.findElement(By.id("customer_lastname"));
//		LastName.sendKeys("Kumar");
//		WebElement Password = driver.findElement(By.id("passwd"));
//		Password.sendKeys("Vinoth@2020");
//		//Thread.sleep(3000);
//
//		WebElement Day = driver.findElement(By.id("days"));
//		Select s1 = new Select(Day);
//		s1.selectByIndex(15);
//		WebElement Month = driver.findElement(By.id("months"));
//		Select s2 = new Select(Month);
//		s2.selectByValue("11");
//		WebElement Year = driver.findElement(By.id("years"));
//		Select s3 = new Select(Year);
//		s3.selectByValue("1994");
//		//Thread.sleep(3000);
//
//		WebElement Check1 = driver.findElement(By.id("newsletter"));
//		Check1.click();
//
//		WebElement Check2 = driver.findElement(By.id("optin"));
//		Check2.click();
//		//Thread.sleep(3000);
//
//		WebElement Company = driver.findElement(By.id("company"));
//		Company.sendKeys("Cognizant");
//
//		WebElement Address = driver.findElement(By.id("address1"));
//		Address.sendKeys("Plot No:43 Dr kalaignar Nagar, 4th Cross Street, Thiruvottiyur");
//
//		WebElement City = driver.findElement(By.id("city"));
//		City.sendKeys("Chennai");
//
//		WebElement State = driver.findElement(By.id("id_state"));
//		Select s4 = new Select(State);
//		s4.selectByValue("14");
//
//		WebElement Postcode = driver.findElement(By.id("postcode"));
//		Postcode.sendKeys("46077");
//
//		WebElement Country = driver.findElement(By.id("id_country"));
//		Select s5 = new Select(Country);
//		s5.selectByValue("21");
//
//		WebElement AdditionalBox = driver.findElement(By.id("other"));
//		AdditionalBox.sendKeys("My mother mobile number is 9176849017");
//
//		WebElement Number = driver.findElement(By.id("phone_mobile"));
//		Number.sendKeys("7401320870");
//
//		WebElement Alias = driver.findElement(By.id("alias"));
//		Alias.sendKeys("Thiruvottiyur");
//
//		WebElement Register = driver.findElement(By.xpath("//span[text()='Register']"));
//		Register.click();

	}
}

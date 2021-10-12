package com.selenium.project;

import java.io.IOException;

import com.pom.org.Login_Page;
import com.pom.org.POMClass;
import com.selenium.concepts.BaseClass;

public class Purchase extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {

		getDriver("chrome");
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		POMClass pm = new POMClass(driver);
		clickOnElement(pm.getFirstPage());

//		POMClass1 pc = new POMClass1(driver);
//		inputValueElement(pc.getSendBtn(), "vino.vicky1993@gmail.com");
//		inputValueElement(pc.getPassBtn(), "Vinoth@2020");
//		clickOnElement(pc.getSigninBtn());
//		Thread.sleep(3000);

		Login_Page lp = new Login_Page(driver);

//		lp.getEmail().sendKeys("vino.vicky1993@gmail.com");
//		lp.getPassword().sendKeys("Vinoth@2020");
//		lp.getSigin().click();

		inputValueElement(lp.getEmail(), "vino.vicky1993@gmail.com");
		inputValueElement(lp.getPassword(), "Vinoth@2020");
		clickOnElement(lp.getSigin());
//		Actions act = new Actions(driver);
//
//		act.moveToElement(driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"))).build().perform();
//		Thread.sleep(3000);
//
//		POMClass2 pc2 = new POMClass2(driver);
//		clickOnElement(pc2.getDress());
//
//		POMClass3 pc3 = new POMClass3(driver);
//		clickOnElement(pc3.getDressView());
//		Thread.sleep(3000);
//
//		driver.switchTo().frame(0);
//		Thread.sleep(5000);
//
//		POMClass4 pm4 = new POMClass4(driver);
//		clickOnElement(pm4.getAddCart());
//
//		POMClass5 pm5 = new POMClass5(driver);
//		clickOnElement(pm5.getCart());
//		Thread.sleep(3000);
//
//		POMClass6 pm6 = new POMClass6(driver);
//		clickOnElement(pm6.getProceed());
//		Thread.sleep(3000);
//
//		POMClass7 pm7 = new POMClass7(driver);
//		clickOnElement(pm7.getCheckOut());
//		Thread.sleep(3000);
//
//		POMClass8 pm8 = new POMClass8(driver);
//		inputValueElement(pm8.getAddress(), "No change in address");
//		Thread.sleep(3000);
//
//		POMClass9 pm9 = new POMClass9(driver);
//		clickOnElement(pm9.getProcessAddress());
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("cgv")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.name("processCarrier")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//		Thread.sleep(3000);
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,300)");
//		Thread.sleep(3000);
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		File destinationFile = new File(
//				"C:\\\\Users\\\\user pc\\\\eclipse-workspace\\\\Selenium project\\\\SrceenShot\\\\purchase order.png");
//		FileUtils.copyFile(screenshotAs, destinationFile);
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[@class='logout']")).click();
//		Thread.sleep(3000);
//
//		driver.quit();

	}
}

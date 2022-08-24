package org.stepdefni;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {
	public static WebDriver driver = null;
  
	@Before
	public static WebDriver browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
public static void wait(By data ,String data1) {
	WebDriverWait wait=new WebDriverWait(driver, 5);
	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.className(data1)));
}
	public static void btclick(WebElement element) {
		element.click();
	}

	public static void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	@After
	public static void close() {
		//driver.close();
	}

}

package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * generic class for webdriver
 * @author Rakesh PM
 *
 */
public class WebDriverCommonLib {
	/**
	 * generic method for implicit wait
	 * @param driver
	 */
	public void waitForElementToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * generic method for explicit wait
	 * @param driver
	 * @param element
	 */
	public void waitForElementPresent(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * generic method custom wait
	 * @param element
	 */
	public void customWaitForElementPresent(WebElement element)
	{
		int i=0;
		while (i<=100)
		{
			try {
				element.isDisplayed();
				break;
			}
			catch(Exception e)
			{
				i++;
			}
		}
	}
	/**
	 * generic method for selecting the value using index
	 * @param element
	 * @param i
	 */
	public void selectElement(WebElement element, int i) {
		Select s= new Select(element);
		s.selectByIndex(i);
	}
	/**
	 * generic method for selecting the value by visible text
	 * @param element
	 * @param text
	 */
	public void selectElement(WebElement element, String text) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}

}

package com.calenderJScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalenderJSExecuter{
	
	public static void main(String [] args){
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.spicejet.com/");
		WebElement date=driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']"));
		String dateVal="27-03-2018";
		selectDateByJSExecuter(driver,date,dateVal);
		
	}
	
   public static void selectDateByJSExecuter(WebDriver driver, WebElement element ,String dateVal){
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	 js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		   
	   }
   }



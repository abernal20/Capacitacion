package com.qvision.prueba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SahiExecution {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  		  
		  driver.get("http://sahitest.com/demo/training/login.htm");
		  
		  //DelcareElements
		  WebElement LinkRegister = driver.findElement(By.xpath("//a"));
		  LinkRegister.click();
		  
		  WebElement TxtUserName = driver.findElement(By.id("uid"));
		  TxtUserName.sendKeys("Axel");
		  
		  WebElement TxtPassword = driver.findElement(By.id("pid"));
		  TxtPassword.sendKeys("Admin123");
		  
		  WebElement TxtRepeatPassword = driver.findElement(By.id("pid2"));
		  TxtRepeatPassword.sendKeys("Admin123");
		  
		  List <WebElement> gender = driver.findElements(By.name("gender"));
		  for(WebElement genero : gender) 
		  {
			  if(genero.getAttribute("value").equals("M")){
				  genero.click();
			  }
		  }
		 
		  WebElement TxtAdress = driver.findElement(By.id("taid"));
		  TxtAdress.sendKeys("Avenida siempre viva 123");
		  
		  WebElement TxtBillingAdress = driver.findElement(By.id("btaid"));
		  TxtBillingAdress.sendKeys("Calle falsa 123");
		  
		  WebElement SlctState = driver.findElement(By.xpath("/html/body/center/div/form/div/table/tbody/tr[7]/td[2]/select"));
		  Select SlctStates = new Select(SlctState);
		  SlctStates.selectByVisibleText("Kerala");		  
		  
		  WebElement ChkAgree = driver.findElement(By.xpath("/html/body/center/div/form/input[1]"));
		  ChkAgree.click();
		  
		  WebElement BtnRegister = driver.findElement(By.xpath("/html/body/center/div/form/input[2]"));
		  BtnRegister.click();		  

		  
		  
		  
		  driver.quit();
	}

}

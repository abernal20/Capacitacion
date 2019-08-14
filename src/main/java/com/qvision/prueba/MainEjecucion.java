package com.qvision.prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainEjecucion {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver = new ChromeDriver();			
		  driver.get("http://developsupport.com/qIntranet/login/index.php");
		  
		  //Declare Elements
		  WebElement TxtUser = driver.findElement(By.id("username"));
		  WebElement TxtPassword = driver.findElement(By.id("password"));
		  WebElement BtnLogin = driver.findElement(By.id("loginbtn"));		  		  
		  
		  //Action Elements		 
		  TxtUser.sendKeys("abernal");		 
		  	Thread.sleep(2000);
		  TxtPassword.sendKeys("Xcronix2020!");
		  	Thread.sleep(2000);
		  BtnLogin.click();		  
			try {
				WebElement LblWrongMessage = driver.findElement(By.xpath("//*[@id=\\\"yui_3_13_0_3_1565455662524_36\\\"]/div[1]/span"));
				if (LblWrongMessage.isDisplayed()) {
					System.out.println("Login failed");
				}
			} catch (NoSuchElementException e) {
			}		  
		  driver.quit();
		  		  		
	}

}

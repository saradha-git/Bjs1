package com.bjs.opensource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {

	WebDriver driver;
	By url=By.linkText("Войти");
	
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	public void login()
	{
		driver.findElement(url).click();
	}
}

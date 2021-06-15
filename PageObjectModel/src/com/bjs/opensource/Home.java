package com.bjs.opensource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	WebDriver driver;
	By username=By.name("log");
	By password=By.name("pwd");
	By submit=By.name("wp-submit");
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void username()
	{
		driver.findElement(username).sendKeys("opensourcecms");
	}
	public void password()
	{
		driver.findElement(password).sendKeys("opensourcecms");
	}
	public void submit()
	{
		driver.findElement(submit).click();
	}
}

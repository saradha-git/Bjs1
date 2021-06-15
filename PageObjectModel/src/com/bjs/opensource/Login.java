package com.bjs.opensource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	By comments=By.xpath("//div[text()='Комментарии ']");
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void comments()
	{
		driver.findElement(comments).click();
	}
}

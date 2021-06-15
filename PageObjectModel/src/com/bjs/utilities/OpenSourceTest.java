package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.opensource.Home;
import com.bjs.opensource.Login;
import com.bjs.opensource.Welcome;

public class OpenSourceTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://s1.demo.opensourcecms.com/wordpress/");
		
		Welcome w=new Welcome(driver);
		w.login();
		
		Home h=new Home(driver);
		h.username();
		h.password();
		h.submit();
		
		Login l=new Login(driver);
		l.comments();

	}

}

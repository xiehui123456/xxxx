package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utll.utll1;

public class loginpage extends utll1{

	public void username() {
		driver.findElement(By.name("username")).sendKeys("hujianming");
		
	}
		
		public void pwd() {
			driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		
	}
		public void Ix() {
			WebElement s1=driver.findElement(By.name("usertype"));
			Select s =new Select(s1);
			s.selectByIndex(2);
		}
		public void dran() {
			driver.findElement(By.className("tm_btn")).click();;
		}
}

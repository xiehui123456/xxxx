package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.utll.utll1;

public class qqqpage extends utll1{
	public void zuo1() {
		driver.switchTo().frame("menu");//定位左边边框
	}
	
	public void xsgl() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();//学生管理
		
	}
	
    public void bjgl() {
    	driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();//班级管理
    }
    public void tuichu1() {
		driver.switchTo().defaultContent();//跳出框架
	}
public void you1() {
		
		driver.switchTo().frame("main");//跳转到右边框架
	}
    
    
	public void xzbj() {
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();//新增班级
	}

	public void jgmc() {
		driver.findElement(By.name("b_name")).sendKeys("火箭一班");//机构名称
	}
	public void zt() {
		WebElement a=driver.findElement(By.name("b_status"));//状态
		Select a1=new Select(a);
		a1.selectByIndex(0);
	}
    public void jgbz() {
    	driver.findElement(By.name("b_remark")).sendKeys("火箭兄弟班");//机构备注
    }
    public void tj() {
    	//提交
    	driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
    }
}

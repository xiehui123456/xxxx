package com.utll;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bsh.Capabilities;

public class utll1 {

			 public static WebDriver driver;
			 public static String url="http://localhost:8080/examsys/login.thtml";
			//��ҳ��
			@BeforeClass
			public void openfire() throws MalformedURLException {
				
				System.setProperty("webdriver.chrome.driver", ".//tools1//Chromedriver.exe");
				driver=new ChromeDriver();
				/*ChromeOptions options=new ChromeOptions();
             DesiredCapabilities capabilities=DesiredCapabilities.chrome();
	         DesiredCapabilities capability = new DesiredCapabilities();
		     capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		     WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.197:6666/wd/hub/"), DesiredCapabilities.chrome());
		     driver.get("http://www.baidu.com");*/
		    
			
		}
			
			@AfterTest
			public void u() {
				
			}
			
			/*@Test
			public void login() throws InterruptedException {
				//�����û���
				driver.findElement(By.name("username")).sendKeys("hujianming");
				//��������
				driver.findElement(By.name("userpass")).sendKeys("hujianming123");
				//��λ������
				WebElement s1=driver.findElement(By.name("usertype"));
				Select s=new Select(s1);
				s.selectByIndex(2);
				Thread.sleep(6000);
				//�����½
				driver.findElement(By.className("tm_btn")).click();
				/*driver.switchTo().frame("menu");//��λ��߱߿�
				driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
				driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();
				driver.switchTo().defaultContent();//�������
				driver.switchTo().frame("main");//��ת���ұ߿��
				driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();//�����༶
				driver.findElement(By.name("b_name")).sendKeys("���һ��");//��������
				WebElement a=driver.findElement(By.name("b_status"));//״̬
				Select a1=new Select(a);
				a1.selectByIndex(0);
				driver.findElement(By.name("b_remark")).sendKeys("����ֵܰ�");//������ע
				driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();*/
			}




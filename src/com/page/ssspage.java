package com.page;

import org.openqa.selenium.By;

import com.utll.utll1;

public class ssspage extends utll1{
	
	public void zuo1() {
		driver.switchTo().frame(0);//¶¨Î»×ó±ß±ß¿ò
	}
	public void tuichu1() {
		driver.switchTo().defaultContent();//Ìø³ö¿ò¼Ü
	}
	
	public void you1() {
		
		driver.switchTo().frame("main");//Ìø×ªµ½ÓÒ±ß¿ò¼Ü
	}

}

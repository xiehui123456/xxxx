package com.page;

import org.openqa.selenium.By;

import com.utll.utll1;

public class ssspage extends utll1{
	
	public void zuo1() {
		driver.switchTo().frame(0);//��λ��߱߿�
	}
	public void tuichu1() {
		driver.switchTo().defaultContent();//�������
	}
	
	public void you1() {
		
		driver.switchTo().frame("main");//��ת���ұ߿��
	}

}

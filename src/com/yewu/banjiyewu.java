package com.yewu;


import com.page.loginpage;
import com.page.qqqpage;
import com.page.ssspage;
import com.utll.utll1;

public class banjiyewu extends utll1{
	
	public void openur1() throws InterruptedException {
		driver.get(url);
		
	}
	
	public void banji() throws InterruptedException {
		
		qqqpage page1=new qqqpage();
		page1.zuo1();//进入左边框
		Thread.sleep(3000);
		page1.xsgl();//学生管理
		Thread.sleep(1000);
		page1.bjgl();//班级管理
		Thread.sleep(1000);
		page1.tuichu1();//退出左边框 
		page1.you1();//进入右边框
		page1.xzbj();//新增班级
		page1.jgmc();//机构名称
		page1.zt();//状态
		page1.jgbz();//机构备注
		page1.tj();//提交
	}

}

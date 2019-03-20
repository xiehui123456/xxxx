package com.yewu;

import com.page.loginpage;
import com.utll.utll1;

public class loginyewu extends utll1{
	//打开网址
	public void openur1() {
		driver.get(url);
	}
	public void login() throws InterruptedException {
		

	//声明页面元素类的变量
	loginpage page=new loginpage();
    //登录的操作
	page.username();
	page.pwd();
	page.Ix();
	Thread.sleep(8000);
	page.dran();
	
}
}
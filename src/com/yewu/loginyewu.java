package com.yewu;

import com.page.loginpage;
import com.utll.utll1;

public class loginyewu extends utll1{
	//����ַ
	public void openur1() {
		driver.get(url);
	}
	public void login() throws InterruptedException {
		

	//����ҳ��Ԫ����ı���
	loginpage page=new loginpage();
    //��¼�Ĳ���
	page.username();
	page.pwd();
	page.Ix();
	Thread.sleep(8000);
	page.dran();
	
}
}
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
		page1.zuo1();//������߿�
		Thread.sleep(3000);
		page1.xsgl();//ѧ������
		Thread.sleep(1000);
		page1.bjgl();//�༶����
		Thread.sleep(1000);
		page1.tuichu1();//�˳���߿� 
		page1.you1();//�����ұ߿�
		page1.xzbj();//�����༶
		page1.jgmc();//��������
		page1.zt();//״̬
		page1.jgbz();//������ע
		page1.tj();//�ύ
	}

}

package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.utll.utll1;

public class qqqpage extends utll1{
	public void zuo1() {
		driver.switchTo().frame("menu");//��λ��߱߿�
	}
	
	public void xsgl() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();//ѧ������
		
	}
	
    public void bjgl() {
    	driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();//�༶����
    }
    public void tuichu1() {
		driver.switchTo().defaultContent();//�������
	}
public void you1() {
		
		driver.switchTo().frame("main");//��ת���ұ߿��
	}
    
    
	public void xzbj() {
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();//�����༶
	}

	public void jgmc() {
		driver.findElement(By.name("b_name")).sendKeys("���һ��");//��������
	}
	public void zt() {
		WebElement a=driver.findElement(By.name("b_status"));//״̬
		Select a1=new Select(a);
		a1.selectByIndex(0);
	}
    public void jgbz() {
    	driver.findElement(By.name("b_remark")).sendKeys("����ֵܰ�");//������ע
    }
    public void tj() {
    	//�ύ
    	driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
    }
}

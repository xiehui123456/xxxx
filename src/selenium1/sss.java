package selenium1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sss {
	WebDriver driver;
	//��ҳ��
	@BeforeClass
	public void openfire() {
		System.setProperty("webdriver.chrome.driver", "./tools1/Chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://localhost:8080/examsys/login.thtml";
		driver.get(url);
	}
	@Test
	public void login1() throws InterruptedException {
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
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("main");
		driver.findElement(By.name("d_name")).sendKeys("�����ο���");
		
	}
	private TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


package com.testcase;



import org.testng.annotations.Test;

import com.utll.utll1;
import com.yewu.loginyewu;

public class logintestcase extends utll1{
	@Test
	public void login() throws InterruptedException {
		loginyewu yewu=new loginyewu();
		yewu.openur1();
		yewu.login();
	}

}

package com.testcase;

import org.testng.annotations.Test;

import com.page.loginpage;
import com.utll.utll1;
import com.yewu.banjiyewu;
import com.yewu.loginyewu;

public class banjitestcase extends utll1{
	@Test
	public void banji() throws InterruptedException {
		banjiyewu yewu=new banjiyewu();
		loginyewu yewu1=new loginyewu();
		yewu.openur1();
		yewu1.login();
		yewu.banji();
	}

}

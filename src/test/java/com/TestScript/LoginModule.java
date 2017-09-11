package com.TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Library.BaseClass;
import com.Library.GenericClass;
import com.pageobjectmodel.LoginPage;

public class LoginModule extends BaseClass {
	
	
	@Test(priority=1,enabled=true)
	public void logintoabofapplication() throws InterruptedException{
		
		LoginPage login=new LoginPage();
		login.SkipSignButton.click();
		Thread.sleep(4000);
	}

}

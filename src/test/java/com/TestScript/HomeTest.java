package com.TestScript;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Library.BaseClass;
import com.pageobjectmodel.HomePage;

public class HomeTest extends BaseClass {
	
	
	@Test
	public void Actionclass() throws InterruptedException{
		
		HomePage home=new HomePage();
		Actions action=new Actions(driver);
		action.moveToElement(home.abofMenText).perform();
		home.abofCasualShirtsText.click();
		Thread.sleep(3000);
		
	}

}

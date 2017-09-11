package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Library.BaseClass;

public class LoginPage2 {
	
	public LoginPage2(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Already')]")
	public WebElement abofAlReadyRegisterOption;
	

}

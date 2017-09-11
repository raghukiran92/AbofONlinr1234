package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Library.BaseClass;

public class HomePage {
	
	
	public HomePage(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	@FindBy(xpath="//a[@title='Men']")
	public WebElement abofMenText;
	
	@FindBy(xpath="//a[text()='Casual Shirts']")
	public WebElement abofCasualShirtsText;

}

package com.test.EdurekaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	/**
     * All WebElements are identified by @FindBy annotation
     */
	
	@FindBy(name="txtUsuario")
    WebElement usuTxt;
	
	@FindBy(name="txtPass")
    WebElement passTxt;
	
	@FindBy(id="cb1")
    WebElement loginButton;
	

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Sets the value of userName in textBox
	public void setUserName(String strUserName) {
		
		usuTxt.sendKeys(strUserName);
	}
	
	
	//Sets the value of password in textBox
	public void setPassword(String strPassTxt) {
		
		passTxt.sendKeys(strPassTxt);
	}
	
	
    //Click on login button
    public void clickLogin(){

    	loginButton.click();
    } 
    
    
    public void loginRecaudador(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();           

    }
	
	
}

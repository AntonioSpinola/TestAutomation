package com.test.EdurekaSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.winium.DesktopOptions;
//import org.openqa.selenium.winium.WiniumDriver;
//import org.openqa.selenium.winium.WiniumDriverService;

public class RealizarCorte {
	WebDriver driver;
//	WiniumDriver wDriver;
//	WiniumDriverService service;
//	DesktopOptions options ;
	
	//DesktopOptions options = new DesktopOptions();
	//wDriver.setApplicationPath("C:\\Program Files (x86)\\Google\\Chrome\\Application");
	//options.ApplicationPath = @"C:\\Program Files (x86)\\Google\\Chrome\\Application";


	/**

     * All WebElements are identified by @FindBy annotation

     */
	
	@FindBy(id="j_id_id5:cxI")
	WebElement dropdownList;
	
	@FindBy(xpath="/html/body/form/div[1]/table[3]/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[4]/td[3]/input")
    WebElement billetes200TxtBox;
	
	@FindBy(xpath="/html/body/form/div[1]/table[3]/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[8]/td[3]/input")
    WebElement moneda10TxtBox;
	
	@FindBy(xpath="//*[@id=\"j_id_id5:j_id_id52\"]/table/tbody/tr/td/table/tbody/tr[14]/td[1]/button")
    WebElement recalcularButton;
	
	@FindBy(xpath="/html/body/form/div[1]/table[3]/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[14]/td[3]/button")
    WebElement realizarCorteButton;
	
	

	public RealizarCorte(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//https://sqa.stackexchange.com/questions/24692/how-to-select-from-the-dropdown-list-in-pagefactory
	//wrapper to use Select in Selenium
	public Select getSelectOptions() {
		  return new Select(dropdownList);
		}
	
	public void setInstrumentoDePago(int value)
	{
	  getSelectOptions().selectByIndex(value);
	}
	

	//Sets the value of billetes de 200 in textBox
	public void setBillete200(String billete200) {
		billetes200TxtBox.click();
		billetes200TxtBox.clear();
        billetes200TxtBox.sendKeys(billete200);
	}
	
	
	//Sets the value of monedas de 10 in textBox
	public void setMoneda10(String moneda10) {
		moneda10TxtBox.click();
		moneda10TxtBox.clear();
		moneda10TxtBox.sendKeys(moneda10);
	}
	
    //Click on RealizarCorte button
    public void clickRecalcular(){

    	recalcularButton.click();
    }
	
    //Click on RealizarCorte button
    public void clickRealizarCorte(){

    	realizarCorteButton.click();
    } 
    

    
}

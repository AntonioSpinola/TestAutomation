package com.test.EdurekaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmRecepcionCorte {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"j_id_id5\"]/div[1]/table[7]/tbody/tr/td[1]/button")
    WebElement recibirCorteButton;
	
public ConfirmRecepcionCorte(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	

public void clickRecivirCorte(){

	recibirCorteButton.click();
}

}

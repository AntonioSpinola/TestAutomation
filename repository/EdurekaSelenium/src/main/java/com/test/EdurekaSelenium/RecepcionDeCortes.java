package com.test.EdurekaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecepcionDeCortes {

	WebDriver driver;

	@FindBy(xpath="//*[@id=\"j_id_id50\"]")
    WebElement serieTxtBox;
	
	@FindBy(xpath="//*[@id=\"j_id_id53\"]")
    WebElement identificadorTxtBox;
	
	@FindBy(xpath="//*[@id=\"buscar\"]")
    WebElement buscarButton;
	
	
	public RecepcionDeCortes(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void setSerieText(String serie) {
		
		serieTxtBox.sendKeys(serie);
	}

	public void setIdentificadorText(String ident) {
		
		identificadorTxtBox.sendKeys(ident);
	}
	
	public void clickBuscar() {
		
		buscarButton.click();
	}


}

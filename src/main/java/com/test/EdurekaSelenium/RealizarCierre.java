package com.test.EdurekaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealizarCierre {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"j_id_id5:j_id_id159\"]")
    WebElement recalcularTextBox;
	
	@FindBy(xpath="//*[@id=\"j_id_id5\"]/div[1]/div[8]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td/button")
    WebElement agregarButton;
	
//	@FindBy(xpath="//*[@id=\"j_id_id5:j_id_id174:0\"]")
//    WebElement seleccionarRadioButton;
	
	@FindBy(xpath="//*[@id=\"j_id_id5\"]/div[1]/div[8]/table/tbody/tr/td/table/tbody/tr[9]/td[2]/table/tbody/tr/td/button")
    WebElement RealizarCierreButton;
	
	
	public RealizarCierre(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void setImporte(String importe) {
		recalcularTextBox.click();
		recalcularTextBox.clear();
		recalcularTextBox.sendKeys(importe);
	}
	
	public void clickAgregar(){

		agregarButton.click();
    }
	
	public void clickRealizarCierreButton(){

		RealizarCierreButton.click();
    }
	
}

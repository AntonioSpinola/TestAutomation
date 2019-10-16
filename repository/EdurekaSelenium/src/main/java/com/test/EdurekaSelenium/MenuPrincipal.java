package com.test.EdurekaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPrincipal {

	WebDriver driver;
	
	/**

     * All WebElements are identified by @FindBy annotation

     */
	
	@FindBy(id="cl2")
    WebElement realizarCorteButton;
	
	@FindBy(xpath="//*[@id=\"cl2j_id_7\"]")
	WebElement recepcionCorteButton;
	
	@FindBy(xpath="//*[@id=\"submenu1j_id_5\"]")
	WebElement administracionCajasButton;
	
	@FindBy(linkText="Realización de Cierres")
	WebElement realizarCierreButton;

	
	public MenuPrincipal(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

	//Click on administracion Cajas
		public void clickAdministracionCaja() {
			
			administracionCajasButton.click();
		}
	
	//Click on Recepcion Corte
	public void clickRecepcionCorte() {
		
		recepcionCorteButton.click();
	}
	
    //Click on RealizarCorte button
    public void clickRealizarCorte(){

    	realizarCorteButton.click();
    } 
    
    public void clickRealizarCierre(){

    	realizarCierreButton.click();
    } 
    
	
}

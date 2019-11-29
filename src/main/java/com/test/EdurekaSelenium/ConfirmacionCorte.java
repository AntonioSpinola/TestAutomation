package com.test.EdurekaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmacionCorte {

	WebDriver driver;
	
	String confText;
	String[] strArray;
	
	@FindBy(xpath="//*[@id=\"j_id_id5:j_id_id31__LIST__\"]/li")
	WebElement confirmacionText;
	
	public ConfirmacionCorte(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String getSerie() {
    	
    	getConfirmacion();   	
        
        return strArray[0];
    	
    }
    
    public String getIdentificador() {
    	
    	getConfirmacion();
    	
    	return strArray[1];
    }
    
    
    private void getConfirmacion() {
    	
    	confText = confirmacionText.getText();
    	
    	if (confText.contains("correctamente")) {
            
    		confText = confText.replaceAll("[A-Z]","");
            confText = confText.replaceAll("[a-z]","");
            confText = confText.replaceAll(" ","");
            
            strArray = confText.split("-");
 
    		
        }else {
            System.out.println("trimmed or not success");
        }
    	
    }
	
}

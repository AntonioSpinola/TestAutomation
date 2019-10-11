package com.test.EdurekaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTestNG {

	WebDriver driver;
	
	LoginPage objLoginPage;
	
	MenuPrincipal objMenuPrincipal;
	
	RecepcionDeCortes objRecepcionDeCortes;
	
	
	@BeforeTest
	@Parameters({"url"})
	public void setup(String url) {
		
		//Set up for the selenium Driver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(url);		
		
	
	}
	
	@Test
	@Parameters({"usuario","password","serie","identificador"})
	public void test_recibirCorte(String usu, String pass, String serie, String identificador) {
		
		objLoginPage = new LoginPage(driver);
		
		objLoginPage.loginRecaudador(usu, pass);
		
		objMenuPrincipal = new MenuPrincipal(driver);
		
		objMenuPrincipal.clickAdministracionCaja();
		objMenuPrincipal.clickRecepcionCorte();
		
		objRecepcionDeCortes = new RecepcionDeCortes(driver);
		
		objRecepcionDeCortes.setSerieText(serie);
		objRecepcionDeCortes.setIdentificadorText(identificador);
		objRecepcionDeCortes.clickBuscar();
		
		
		
	}
	
	
}

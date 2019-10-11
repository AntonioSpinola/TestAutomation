package com.test.EdurekaSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTestNG {
	
	
		WebDriver driver;
	
	//variables for Winium Driver
//		WiniumDriverService service;
//		WiniumDriver driverWinium;
//		DesktopOptions options;
	
	LoginPage objLoginPage;
	
	MenuPrincipal objMenuPrincipal;
	
	RealizarCorte objRealizarCorte;
	
	//DesktopAppController objDesktopAppController;
	
	RecepcionDeCortes objRecepcionDeCortes;
	
	ConfirmacionCorte objConfirmacionCorte;
	
	ConfirmRecepcionCorte objConfirmRecepcionCorte;
	
	RealizarCierre objRealizarCierre; 

	String serie;
	String identificador;
	
	@BeforeTest
	@Parameters({"url"})
	public void setup(String url) {
		
		//Set up for the selenium Driver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(url);		
		
		//Set up for the Winium Driver
//		options = new DesktopOptions();
//		options.setDebugConnectToRunningApp(true);
//		options.setApplicationPath("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//		File driverPath = new File("C:\\Users\\instalacion\\Documents\\TEC\\Winium.Desktop.Driver.exe");
//		service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999)
//				.withVerbose(true).withSilent(false).buildDesktopService();
//		try {
//			service.start();
//		} catch (IOException e) {
//			System.out.println("Exception while starting WINIUM service");
//			e.printStackTrace();
//		}
//		driverWinium = new WiniumDriver(service,options);
		
	}
	
	
	@Test
	@Parameters({"usuario","password"})
	public void test_recalcularcorte(String usu, String pass) {
		
		//Create new logIn page object
		objLoginPage = new LoginPage(driver);
		
		objLoginPage.loginRecaudador(usu, pass);
		
		//Create new menuPrincipal page object
		objMenuPrincipal = new MenuPrincipal(driver);
		
		objMenuPrincipal.clickRealizarCorte();
		
		//Create new RealizarCorte page Object
		objRealizarCorte = new RealizarCorte(driver);
		
		objRealizarCorte.setInstrumentoDePago(1);
		
		objRealizarCorte.setBillete200("3");
		
		objRealizarCorte.setMoneda10("3");
		
		objRealizarCorte.clickRecalcular();
		
		objRealizarCorte.clickRealizarCorte();
		
		
		//Control the google Chrome notification
		//objDesktopAppController = new DesktopAppController();
		//objDesktopAppController.clickAceptar();
		
		
		driver.switchTo().alert().accept();;
		
		
		objConfirmacionCorte = new ConfirmacionCorte(driver);
		
		serie = objConfirmacionCorte.getSerie();
		
		identificador = objConfirmacionCorte.getIdentificador();
		
		
		//quick solution to to back to the main menu. 
		WebElement a = driver.findElement(By.xpath("//*[@id=\"j_id_id5\"]/table[1]/tbody/tr/td[1]/a/img"));
        a.click();
		
	}
	
	@Test
	//@Parameters({"serie","identificador"})
	public void test_recibirCorte() {
		
		objMenuPrincipal = new MenuPrincipal(driver);
		
		objMenuPrincipal.clickAdministracionCaja();
		objMenuPrincipal.clickRecepcionCorte();
		
		objRecepcionDeCortes = new RecepcionDeCortes(driver);
		
		objRecepcionDeCortes.setSerieText(serie);
		objRecepcionDeCortes.setIdentificadorText(identificador);
		objRecepcionDeCortes.clickBuscar();
		
		objConfirmRecepcionCorte = new ConfirmRecepcionCorte(driver);
		
		objConfirmRecepcionCorte.clickRecivirCorte();
		
		driver.switchTo().alert().accept();
		
		//quick solution to to back to the main menu. 
		WebElement a = driver.findElement(By.xpath("//*[@id=\"j_id_id5\"]/table[1]/tbody/tr/td[1]/a/img"));
        a.click();
		
	}
	
	
	@Test
	public void test_realizarCierre() {
		
		objMenuPrincipal = new MenuPrincipal(driver);
		
		objMenuPrincipal.clickAdministracionCaja();
		objMenuPrincipal.clickRealizarCierre();
		
		objRealizarCierre = new RealizarCierre(driver);
		
		objRealizarCierre.setImporte("630");
		
		objRealizarCierre.clickAgregar();
		
		objRealizarCierre.clickRealizarCierreButton();
		
		driver.switchTo().alert().accept();
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"j_id_id5\"]/table[1]/tbody/tr/td[1]/a/img"));
        a.click();
	}
	
	
	@AfterTest
	public void tearDown(){
//		objDesktopAppController.StopService(service);
	}

}

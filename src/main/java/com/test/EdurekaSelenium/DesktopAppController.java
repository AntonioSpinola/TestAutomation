package com.test.EdurekaSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;



public class DesktopAppController {

//	 DesktopOptions options;
//	 WiniumDriverService service;
//	 WiniumDriver driver;
//	

//	public DesktopAppController(WiniumDriver driver, DesktopOptions options, WiniumDriverService service) {
//		
//		this.driver = driver;
//		
//		
//		this.options = new DesktopOptions();
//		this.options.setDebugConnectToRunningApp(true);
//		this.options.setApplicationPath("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//		File driverPath = new File("C:\\Users\\instalacion\\Documents\\TEC\\Winium.Desktop.Driver.exe");
//		this.service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999)
//				.withVerbose(true).withSilent(false).buildDesktopService();
//		try {
//			this.service.start();
//		} catch (IOException e) {
//			System.out.println("Exception while starting WINIUM service");
//			e.printStackTrace();
//		}
//		this.driver = new WiniumDriver(service,options);
//		
//
//		
//	}
	

	public DesktopAppController() {
		// TODO Auto-generated constructor stub
	}


	public void clickAceptar(WiniumDriver d) {
		
		d.findElement(By.className("Chrome_RenderWidgetHostHWND")).submit();

		
	}

	public void StopService(WiniumDriverService s) {
		
		s.stop();

		
	}

	
}

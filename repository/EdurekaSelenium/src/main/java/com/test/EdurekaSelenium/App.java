package com.test.EdurekaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
   	 	System.setProperty("webdriverchrome.driver","C:\\Users\\instalacion\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
   	 	WebDriver driver = new ChromeDriver();
        driver.get("http://wls33.tgc.mx:8080/re_login/faces/infraestructura/login.jspx?_adf.ctrl-state=s7xuq5fq7_3");
        
        
        WebElement usuTxt = driver.findElement(By.name("txtUsuario"));
        usuTxt.sendKeys("RECAUDADOR");

        WebElement passTxt = driver.findElement(By.name("txtPass"));
        passTxt.sendKeys("THEBIGONE");
        
        WebElement loginButton = driver.findElement(By.id("cb1"));
        loginButton.click();
        
        WebElement administracionCajasButton = driver.findElement(By.xpath("//*[@id=\"submenu1j_id_5\"]"));
        administracionCajasButton.click();
        
        
        
        WebElement realizarCierreButton = driver.findElement(By.linkText("Realización de Cierres"));
        realizarCierreButton.click();
        

        
        if(false) {
        // para estas acciones se necesita crear una clase aparte para usar Page Object porque es una pagina diferente
        WebElement realizarCorteButton = driver.findElement(By.id("cl2"));
        realizarCorteButton.click();
        
        
        // para estas acciones se necesita crear una clase aparte para usar Page Object porque es una pagina diferente
        Select selectOneInstrumentoPago = new Select(driver.findElement(By.id("j_id_id5:cxI")));
        selectOneInstrumentoPago.selectByIndex(1); //a recorrer las opciones
        
        WebElement billetes200TxtBox = 	driver.findElement(By.xpath("/html/body/form/div[1]/table[3]/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[4]/td[3]"));
        Thread.sleep(1000);
        //billetes200TxtBox.click();
        
        
        System.out.println( "boton" );
        WebElement b = 	driver.findElement(By.xpath("/html/body/form/div[1]/table[3]/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[4]/td[3]/input"));
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ; //explicit
        b.click();
        b.clear();
        b.sendKeys("3");
        
        
        System.out.println( "moneda" );
        WebElement moneda10TxtBox = 	driver.findElement(By.xpath("/html/body/form/div[1]/table[3]/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[8]/td[3]/input"));
        moneda10TxtBox.click();
        moneda10TxtBox.clear();
        moneda10TxtBox.sendKeys("3");
        
        WebElement recalcularButton = driver.findElement(By.xpath("//*[@id=\"j_id_id5:j_id_id52\"]/table/tbody/tr/td/table/tbody/tr[14]/td[1]/button"));
        recalcularButton.click();
        
        WebElement corteButton = driver.findElement(By.xpath("/html/body/form/div[1]/table[3]/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[14]/td[3]/button"));
        corteButton.click();
        
        }
        //------------------------------------------------
//        WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
//        SearchBox.sendKeys("iPhone");
//        
//        WebElement SearchIcon = driver.findElement(By.className("nav-input"));
//        SearchIcon.click();
//        
//        WebElement checkBox = driver.findElement(By.linkText("Nuevo"));
//        checkBox.click();
//        
//        
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,4000)");
        //------------------------------------------------
        
        
        System.out.println( "Fin" );
        
        //driver.quit();
    }

	private static void cajas() {
		// TODO Auto-generated method stub
		
	}
}

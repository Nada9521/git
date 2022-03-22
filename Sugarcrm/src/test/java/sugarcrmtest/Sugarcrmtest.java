package sugarcrmtest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sugarcrmtest{
	
	WebDriver driver;
	@Test 
	public void Runtunisianet() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        // open site web tunisianet 
driver.get("https:www.sugarcrm.com/uk/request-demo/");

Thread.sleep(2000);

driver.findElement(By.xpath("//button[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
        

        //remplir le champ
        driver.findElement(By.xpath("//input [@name=\"firstname\"]"))
        .sendKeys("Nada");
     
        Thread.sleep(2000);
       
        driver.findElement(By.xpath("//input[@name=\"lastname\"]"))
        .sendKeys("Farah");
       
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name=\"email\"]"))
        .sendKeys("nada.frh@gmail.com");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name=\"phone_work\"]"))
        .sendKeys("2254613");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name=\"title\"]"))
        .sendKeys("Consultant test ");
         
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name=\"account_name\"]"))
        .sendKeys("neolians");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//class[@name=\"employees_c\"]"))
        .sendKeys("11-50 employees");
        
        
	}
}

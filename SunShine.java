import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

	public class SunShine
	{
		
	//  static WebDriver driver;
		File file = new File("C://Selenium//IEDriverServer_x64_3.4.0//IEDriverServer.exe");
		System.setproperty("webdriver.ie.driver", file.getAbsolutePath()) ;
			static WebDriver driver;
		 
	   // Writing before annotation so that the method run before execution of any other method
	   @Before
	   public void OpenBrowser()
		 {
		//	driver=new FirefoxDriver();
		   driver = new InternetExplorerDriver();			
		 }
	   // Writing test annotation to convert the open method as a test condition
	   @Test
	   public void Open()
	   {
		   	driver.get("http://google.co.in");
			Point point=driver.findElement(By.id("hplogo")).getLocation();
			driver.findElement(By.name("q")).sendKeys("sulaxman");
			driver.findElement(By.name("btnG")).click();
			driver.navigate().refresh();
			driver.close();
		}
	}


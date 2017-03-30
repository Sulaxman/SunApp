import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class SunShine
	{
		
	  static WebDriver driver;
	   @Before
	   public void OpenBrowser()
		 {
			driver=new FirefoxDriver();
					
		 }
	   @Test
	   public void Open()
	   {
		   	driver.get("http://google.co.in");
			Point point=driver.findElement(By.id("hplogo")).getLocation();
			driver.findElement(By.name("q")).sendKeys("test");
			driver.findElement(By.name("btnG")).click();
			driver.navigate().refresh();
			driver.close();
		}
	}


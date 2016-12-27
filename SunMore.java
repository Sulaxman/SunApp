import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;

public class SunMore 
{
static WebDriver driver;
@BeforeClass
public static void openBrowser()
{
driver=new FirefoxDriver();
}

  @Test
  public void sizeAndLocation() 
  {
  
  //Open AllState site using get() method
  driver.get("https://www-stest.allstate.com/");
  
  //The window().maximize() is used to maximize the size of Browser window
  driver.manage().window().maximize();
  
 // using getSize() method to get size of web element 
  Dimension dimesions=driver.findElement(By.id("Img1")).getSize();
  System.out.println("Width : "+dimesions.width);
  System.out.println("Height : "+dimesions.height);
 
  //using getLocation() method to get the X and Y coordinates of web elements
  Point point=driver.findElement(By.id("Img1")).getLocation();
  System.out.println("X Position : "+ point.x);
  System.out.println("Y Position : " +point.y);
  
  }
  
  @Test
  public void displayPresence() {
  
  //Open AllState site using get() method
  driver.get("https://www-stest.allstate.com/");
    
 // using isDisplayed() method to check the presence of Contact Us icon in home page 
  boolean contact_icon=driver.findElement(By.linkText("Contact Us")).isDisplayed();

  if(contact_icon)
 {
 System.out.println("Contact Us Icon is diaplayed in All State website");
 }
 else
 
 System.out.println("Contact Us Icon is not diaplayed in All State website");
  
  }
  
  @AfterClass
  public static void closeBrowser()
  {
  driver.quit();
  }
}

package answerdigital;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Testcase2 {
	WebDriver bo;

  @Test
  public void mtd_testcase2() throws Exception {
	  bo.findElement(By.xpath("//a[contains(text(),'Infinite Scroll')]")).click();	
	  Actions acr=new Actions(bo);
		Thread.sleep(1000);
		acr.sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(1000);
		acr.sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(1000);
		acr.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Annu\\Desktop\\Selenium\\Browser drivers\\chromedriver.exe");
	     bo=new ChromeDriver();
		bo.get("http://the-internet.herokuapp.com");
  }

  @AfterMethod
  public void afterMethod() {
	 bo.close();

}
}

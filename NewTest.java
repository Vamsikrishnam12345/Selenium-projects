package Test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	 WebDriver d;
  @Test
  public void tstmd() throws InterruptedException {
	  
	  d.findElement(By.name("Item")).sendKeys("computer books");
	  d.findElement(By.name("Quantity")).sendKeys("3");
	  d.findElement(By.id("save")).click();
	  Thread.sleep(2000);
	  Alert sa=d.switchTo().alert();
	  sa.accept();
	   Thread.sleep(2000);
	  d.findElement(By.id("clear")).click();
	  Thread.sleep(2000);
	  Alert ca=d.switchTo().alert();
	  ca.accept();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path1);
	  d=new ChromeDriver();
	  d.get("C:\\Practice\\project\\cart1.html");
  }

  @AfterMethod
  public void afterMethod() {
	  d.close();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}

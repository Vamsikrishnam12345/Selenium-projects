package project1;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class seldemo {

	public static void main(String[] args) throws InterruptedException {
		String path1="D:\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Practice/project/Cart1.html");
	/*	driver.findElement(By.id("username")).sendKeys("Aishakhan23");
		driver.findElement(By.id("password")).sendKeys("Aishakhan24@");
		driver.findElement(By.id("login")).click();
		Select dropDown=new Select(driver.findElement(By.id("location")));
		dropDown.selectByIndex(5);
		Select dropDown1=new Select(driver.findElement(By.id("hotels")));
		dropDown1.selectByIndex(2);
		Select dropDown2=new Select(driver.findElement(By.id("room_type")));
		dropDown2.selectByIndex(3); */
		driver.findElement(By.name("name")).sendKeys("Computer books");
		/*driver.findElement(By.name("data")).sendKeys("2");*/
		driver.findElement(By.name("data")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.id("save")).click();
		driver.findElement(By.id("update")).click();
		driver.findElement(By.id("delete")).click();
		driver.findElement(By.id("clear")).click();
		
		
	
		
		
		
	}

	private static CharSequence SaveItem() {
		// TODO Auto-generated method stub
		return null;
	}

}

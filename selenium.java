package progravm1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		
		 String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path1);
		  WebDriver d=new ChromeDriver();
		  d.get("C:\\Practice\\project\\cart1.html");
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
		  d.close();



	}

}

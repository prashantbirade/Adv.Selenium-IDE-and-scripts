package Assigment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsmsg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		
		 driver.findElement(By.name("cusid")).sendKeys("12345");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
		 
		 Alert a1=driver.switchTo().alert();
		 System.out.println("first alert message: "+a1.getText());
		 a1.accept();

		 Thread.sleep(2000);
		 
		 Alert a2=driver.switchTo().alert();
		 System.out.println("second alter massegae:"+a2.getText());
		 a2.accept();
		 Thread.sleep(2000);
		 
		 driver.close();
		 
	}

}

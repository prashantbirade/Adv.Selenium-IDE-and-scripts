package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(2000);
		WebElement d1=driver.findElement(By.id("fruits"));
		Select select=new Select(d1);
		
		for (int i = 0; i < 5; i++) {
		
			select.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		driver.close();
	}

}

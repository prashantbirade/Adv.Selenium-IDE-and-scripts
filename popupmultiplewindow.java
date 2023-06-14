package Assigment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupmultiplewindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(3000);
		
		String main_w=driver.getWindowHandle();
		System.out.println("main window is...."+main_w);
	
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		
		
		Set<String> all_w=driver.getWindowHandles();
		Iterator<String> i1=all_w.iterator();
		
		while (i1.hasNext()) {
			String child_w = (String) i1.next();
			System.out.println(child_w);
			
		if (!main_w.equals(child_w)) {
			
			driver.switchTo().window(child_w);
			Thread.sleep(2000);
			driver.findElement(By.name("emailid")).sendKeys("prashant@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("btnLogin")).click();
			driver.close();
			
			
		}
				
		}
		
		driver.switchTo().window(main_w);
		System.out.println("main window title is  "+main_w);
		Thread.sleep(2000);
		driver.close();
	}

}

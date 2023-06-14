package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriver {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	Thread.sleep(2000);
	driver.quit();
	
	System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	driver1.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver1.quit();
	
	System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver2=new ChromeDriver();
	driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver2.quit();
	
	System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver3=new ChromeDriver();
	driver3.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver3.quit();
	
	System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver4=new ChromeDriver();
	driver4.get("https://jqueryui.com/");
	Thread.sleep(2000);
	driver4.quit();
	
	System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver5=new ChromeDriver();
	driver5.get("https://only-testing-blog.blogspot.com/");
	Thread.sleep(2000);
	driver5.quit();
	
	System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver6=new ChromeDriver();
	driver6.get("https://testpages.herokuapp.com/styled/index.html");
	Thread.sleep(2000);
	driver6.quit();
	
	
}
}

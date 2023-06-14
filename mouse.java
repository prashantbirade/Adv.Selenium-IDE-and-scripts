package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		
		Actions actions=new Actions(driver);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		Action a1=actions.moveToElement(home).build();
		a1.perform();
		Thread.sleep(2000);
		
		WebElement flight=driver.findElement(By.linkText("Flights"));
		Action a2=actions.moveToElement(flight).build();
		a2.perform();
		Thread.sleep(2000);
		
		WebElement hotel=driver.findElement(By.linkText("Hotels"));
		Action a3=actions.moveToElement(hotel).build();
		a3.perform();
		Thread.sleep(2000);
		
		WebElement car=driver.findElement(By.linkText("Car Rentals"));
		Action a4=actions.moveToElement(car).build();
		a4.perform();
		Thread.sleep(2000);
		
		WebElement Cruises=driver.findElement(By.linkText("Cruises"));
		Action a5=actions.moveToElement(Cruises).build();
		a5.perform();
		Thread.sleep(2000);
		
		WebElement Destinations=driver.findElement(By.linkText("Destinations"));
		Action a6=actions.moveToElement(Destinations).build();
		a6.perform();
		Thread.sleep(2000);
		
		WebElement Vacations=driver.findElement(By.linkText("Vacations"));
		Action a7=actions.moveToElement(Vacations).build();
		a7.perform();
		Thread.sleep(2000);
		
		driver.close();
		
		driver.findElement(By.cssSelector("a[style='text-align:.center;'")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}

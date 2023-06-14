package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keybord {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	WebElement e1=driver.findElement(By.id("email"));
	
	Actions actions=new Actions(driver);
	Action a1=actions.moveToElement(e1)
			.click()
			.keyDown(e1, Keys.SHIFT)
			.sendKeys("prashant")
			.doubleClick()
			.contextClick()
			.build();
	a1.perform();
	Thread.sleep(3000);
	driver.close();
}
}

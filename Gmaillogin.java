package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/signup/v2/createaccount?continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgmail%26rlz%3D1C1ONGR_enIN1013IN1014%26oq%3Dgmail%26aqs%3Dchrome.0.69i59j0i131i433i512l3j0i433i512j0i131i433i512j0i433i512l2j0i131i433i512j0i271.1032871979j0j15%26sourceid%3Dchrome%26ie%3DUTF-8&hl=en&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(3000);
		
		driver.findElement(By.id("firstName")).sendKeys("prashant");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div[2]/select")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div[2]/select/option[12]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("24");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(2000);
		driver.findElement(By.id("gender")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[2]/select/option[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Username")).sendKeys("praskumar1024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("pass!@#$%");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("pass!@#$%");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button/span")).click();
//		Thread.sleep(2000);
		
	}

}

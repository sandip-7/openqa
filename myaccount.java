package jaava;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class myaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaopen.bishalkarki.xyz/");
		
		WebElement nav_simple, button1, nav_confirm, button2, nav_submission;
		
		
		nav_simple = driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span"));
		nav_simple.click();
		
		button1 = driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[2]/a"));
		button1.click();
			
		Thread.sleep(5000);
		
		nav_confirm = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		nav_confirm.click();
		nav_confirm.sendKeys("Hari12@gamil.cim");
		button2 = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		button2.sendKeys("12345");
		button2.click();
		
		Thread.sleep(5000);
		
		nav_submission = driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button"));
		nav_submission.click();
		
		
		
		

	}

}

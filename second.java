package jaava;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class second {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://qaopen.bishalkarki.xyz/");
		driver.manage().window().maximize();


	}

}




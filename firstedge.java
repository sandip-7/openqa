package jaava;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
public class firstedge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://qaopen.bishalkarki.xyz/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		WebElement nav_login, txtbox_username,txtbox_password,loginButton;
		nav_login = driver.findElement(By.id("login2"));
		nav_login.click();
		Thread.sleep(5000);
		txtbox_username = driver.findElement(By.id("E-Mail Address"));
		txtbox_username.sendKeys("test");
		txtbox_password = driver.findElement(By.id("input-email"));
		txtbox_password.sendKeys("test123");
		loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginButton.click();

	}

}

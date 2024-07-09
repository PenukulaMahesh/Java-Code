import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Webdriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("mahesh");
		driver.findElement(By.name("password")).sendKeys("hello123");
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_2Lks6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='sqdOP yWX7d     _8A5w5   ZIAjV ']")).click();
		
		
		
	}

}

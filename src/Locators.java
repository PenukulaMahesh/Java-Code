
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mahesh");
		driver.findElement(By.name("pass")).sendKeys("hello123");
		driver.findElement(By.name("login")).click();
		String A= driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
		System.out.println(A);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		String user= driver.findElement(By.xpath("//div[text()='Please enter your email address or mobile number to search for your account.']")).getText();
		System.out.println(user);
		driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("rakesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy']")).click();
		driver.findElement(By.id("email")).sendKeys("9949020854");
		driver.findElement(By.name("pass")).sendKeys("Mahi@9949");
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		
	}
	
}
		
		
		



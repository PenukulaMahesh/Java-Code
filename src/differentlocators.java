import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class differentlocators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://affiliate.flipkart.com/login");
		driver.findElement(By.className("form-control")).sendKeys("mahesh@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.id("submitLogin")).click();
		Thread.sleep(3000);
	    driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.cssSelector("input[name='forgotPasswordInputEmail']")).sendKeys("mahesh@gmail.com");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		String B=driver.findElement(By.xpath("//h1[text()='Login']")).getText();
		System.out.println(B);
	
	
		
		
		
		

	}

}

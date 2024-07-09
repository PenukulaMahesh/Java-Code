import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/input)[1]")).sendKeys("Mahesh@gmail.com");
		System.out.println(driver.findElement(By.xpath("//div/ul/li[2]/parent::ul/li[2]")).getText());
		
		
		

	}

}

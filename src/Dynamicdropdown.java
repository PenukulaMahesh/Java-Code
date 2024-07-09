import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).click();
		driver.findElement(By.xpath("//*[text()='Bhopal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();

	}

}

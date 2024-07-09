import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spcicejetdropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[text()='round trip']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[text()='Bhopal']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-day-29'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-day-4'])[2]")).click();
		
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		driver.findElement( By.xpath("//div[text()='USD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Students']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-zso239'])[2]")).click();
		driver.findElement(By.xpath("//*[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		
		


	}

}

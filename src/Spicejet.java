import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
		Thread.sleep(2000L);
		    
		
		
		
		
		Thread.sleep(2000L);
		
		/*int i=1;
		while (i<5)
		{
			driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}*/
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
		
		driver.findElement(By.xpath("//*[@data-testid='home-page-travellers-done-cta']")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());

	}

  }
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestionsflipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mob");
		Thread.sleep(2000);
		List<WebElement> options =(List<WebElement>) driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("mobiles"))
					{
				option.click();
				break;
				
					}
		}
		
		

	}

}

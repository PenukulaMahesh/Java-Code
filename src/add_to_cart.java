import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_to_cart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedname=name[0].trim();
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			int j=0;
			if(itemsNeededList.contains(formattedname))
			
			{
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if(j==3)
				{
				break;
				}
			}
			
			
		}
		
		/*List<WebElement> products1=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<products1.size();i++)
		{
			String name=products1.get(i).getText();
			Thread.sleep(2000);
			if(name.contains("Brocolli"))
			Thread.sleep(2000);
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
			
			
		}*/
		
		
		
	}

}

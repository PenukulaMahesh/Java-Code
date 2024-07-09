import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datatypesamazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 11t");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String A=driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
		System.out.println(A);
		
		//short f=driver.findElement(By.xpath("(//*[text()='14,999'])[2]")).get
	//	System.out.println(f +" price");
		
		
		
		
		
		
		 
		
		 /*driver.switchTo().defaultContent();
		 ArrayList tabs1 = new ArrayList(driver.getWindowHandles());*/
		 //driver.switchTo().window((String) tabs1.get(1));
		 
		 
		/* String B= driver.findElement(By.xpath("(//span[text()='₹14,999.00'])[3]")).getText();
		 System.out.println("String: "+B);
		 short  myShort = Short.valueOf(B);
		 System.out.println("short: "+myShort);*/
		 
		 
	}

}

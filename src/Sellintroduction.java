import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Sellintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking browser
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Firefox launch
		//geckodriver
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\PC\\Downloads\\geckodriver-v0.32.0-win32(4)\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver","C:\\Users\\PC\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver ();
		
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
		

	}

}

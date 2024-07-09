import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class prints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// List<WebElement> List= driver.findElements(By.tagName("a"));

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		{
			
			int i=0;
			int j=1;
			//int z=1;
			for (i=0; i < links.size();i++){
				String link=links.get(i).getAttribute("href");
				
				
				if(link==null) {
					//System.out.println(z+"this is null url : "+link);
					//z++;
					
			}else if(link.contains("https://www.amazon.in")) {
				
			     System.out.println(j +". "+link);
			     j++;
			}}
				}
			

		driver.quit();
	}

	private static int ParsInteger(String link) {
		// TODO Auto-generated method stub
		return 0;
	}

}

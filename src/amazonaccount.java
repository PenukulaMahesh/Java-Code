import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class amazonaccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver ();
		System.setProperty("webdriver.edge.driver","C:\\Users\\PC\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver ();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Blogin%2Bfree%26adgrpid%3D58682845653%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjwmouZBhDSARIsALYcoupsKB2ZPYvSk9Osg9xZZJsjV9FqaR8mySZSozoKwAQSI_eusVglrnEaAhWuEALw_wcB%26hvadid%3D617779680650%26hvdev%3Dc%26hvlocphy%3D1007744%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D6091389605481644770%26hvtargid%3Dkwd-334135621648%26hydadcr%3D5870_2362052%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.xpath("//input[@placeholder='First and last name']")).sendKeys("mahesh");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9949020854");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pm666820@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mahi@9949");
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		
	}

}

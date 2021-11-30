import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		//OPENING FACEBOOK IN CHROME
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//Validating page title
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
		
		//OPENING FACEBOOK IN FIREFOX
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//Validating page title
		String title1 = driver.getTitle();
		Assert.assertTrue(title1.contains("Facebook"));
				
		
		//OPENING FACEBOOK IN MICROSOFT EDGE
		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		//Validating page title
		String title2 = driver.getTitle();
		Assert.assertTrue(title2.contains("Facebook"));
		

	}

}

package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test {

	public static WebDriver driver;
	@BeforeSuite
	public void OpenUrl()

	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	}
	  @DataProvider 
	  public String [][] data(){
		return new String[][] {
			{"Facebook"}
		} ;

	}
}

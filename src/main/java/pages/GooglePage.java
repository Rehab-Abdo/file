package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePages {
	public GooglePage(WebDriver driver) {
		super(driver);
	}
	 
	  
	  @FindBy(xpath="//a[normalize-space()='English']")
	  WebElement change_Text;
	  
	  @FindBy(xpath="//input[@title='Search']")
	  WebElement sreach_Text;
	  @FindBy(xpath="//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
	  WebElement search_link;
     
	  public void changeLang() {
		  change_Text.click();
			
		}
	  public void SetText(String keyWord) {
		  sreach_Text.sendKeys(keyWord);
		  
	  }
	  
	  public void EnterSearchBtn() {
		//  change_Text.click();
		//	sreach_Text.sendKeys("facebook");
			search_link.click();
		}
}

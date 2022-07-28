package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePages {
	public ResultPage(WebDriver driver) {
		super(driver);
	}
	

	 @FindBy(xpath="//div[@id='result-stats']")
	  WebElement ResultText;

	public String GetActualResult() {
		
		return	ResultText.getText();
	}

}

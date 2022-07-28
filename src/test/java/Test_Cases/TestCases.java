package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GooglePage;
import pages.ResultPage;

public class TestCases extends Base_Test {
	GooglePage GoogleObj;
	ResultPage ResultObj;

	@Test(dataProvider = "data") 
	public void GoogleSearch(String keyWord) {
		GoogleObj = new GooglePage(driver);
		ResultObj = new ResultPage(driver);
		GoogleObj.changeLang();
		GoogleObj.SetText(keyWord);
		GoogleObj.EnterSearchBtn();
	  String text=	ResultObj.GetActualResult();
	  Assert.assertTrue(text.contains("About"));
	  Assert.assertTrue(text.contains("results"));
	  Assert.assertTrue(text.contains("seconds"));	
	}

}

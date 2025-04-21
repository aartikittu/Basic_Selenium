package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage 
{
	public GoogleSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	private WebElement search_box;
	
	/*
	 * @FindBy(xpath="(//input[@class=\"gNO89b\"])[2]") private WebElement
	 * search_button;
	 */

	public WebElement getSearch_box() {
		return search_box;
	}

	/*
	 * public WebElement getSearch_button() { return search_button; }
	 */
	
	public void searchTheQues(String query)
	{
		search_box.sendKeys(query);
		search_box.submit();
	//	search_button.click();
	}
	

}

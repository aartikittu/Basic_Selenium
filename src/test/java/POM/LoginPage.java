package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement UserNameTextBox;
	
	@FindBy(id="password")
	private WebElement passwordTextBox;
	
	@FindBy(className = "btn_action")
	private WebElement loginButton;

	public WebElement getUserNameTextBox() {
		return UserNameTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginToApp(String username, String password)
	{
		UserNameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		loginButton.click();
	}

}

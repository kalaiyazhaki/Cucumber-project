package pom.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class ForgotPojoClass extends BaseClass{
	public ForgotPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Sign In / Register']")
	private WebElement signIn;
	@FindBy(id="zapposSignIn")
	private WebElement login;
    @FindBy(id="auth-fpp-link-bottom")
    private WebElement forgot;
    @FindBy(name="email")
    private WebElement email;
    @FindBy(id="continue")
    private WebElement contin;	
    @FindBy(xpath="//h4[text()='There was a problem']")
    private WebElement text;
	public WebElement getSignIn() {
		return signIn;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getForgot() {
		return forgot;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getContin() {
		return contin;
	}
	public WebElement getText() {
		return text;
	}
}

package addtocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {

	
	
	@FindBy(id="user-name")
	private WebElement usernmtb;
	
	@FindBy(id="password")
	private WebElement pwdtb;
	
	@FindBy(id="login-button")
	private WebElement loginbt;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addtocartbtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addcartsymbol;

	public Addtocart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void usernamemtab(String un) {
		usernmtb.sendKeys(un);
	}
	
	public void passwordtab(String pw) {
		pwdtb.sendKeys(pw);
	}
	
	public void loginbutton() {
		loginbt.click();
	}
	
	public void addtocartbutton() {
		addtocartbtn.click();
	}
	 
	public void addtocartfunction() {
		addcartsymbol.click();
	}

}

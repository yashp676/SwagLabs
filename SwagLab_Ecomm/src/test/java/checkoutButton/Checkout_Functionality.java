package checkoutButton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Functionality {

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
     
	@FindBy(id="checkout")
	private WebElement checkoutbtn;
	
	@FindBy(id="first-name")
	private WebElement firstnmtb;
	
	@FindBy(id="last-name")
	private WebElement lastnmtb;
	
	@FindBy(id="postal-code")
	private WebElement zipcode;
	
	@FindBy(id="continue")
	private WebElement ctn;
	
	public  Checkout_Functionality(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void Addtocart(WebDriver driver) {
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
	public void addtocartsymbol() {
		addcartsymbol.click();
	}
	public void checkout() {
		checkoutbtn.click();
	}
	public void firstname(String fn) {
		firstnmtb.sendKeys(fn);
	}
	
	public void lastname(String ln) {
		lastnmtb.sendKeys(ln);
	}
	
	public void zip(String zp) {
		zipcode.sendKeys(zp);
	}
	
	public void continuetb() {
		ctn.click();
	}
}

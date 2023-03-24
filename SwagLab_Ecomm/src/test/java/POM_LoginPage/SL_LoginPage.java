package POM_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SL_LoginPage {
		
		@FindBy(id="user-name")
		private WebElement usernmtb;
		
		@FindBy(id="password")
		private WebElement pwdtb;
		
		@FindBy(id="login-button")
		private WebElement loginbt;
		
		
		public SL_LoginPage(WebDriver driver) {
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
	}
	


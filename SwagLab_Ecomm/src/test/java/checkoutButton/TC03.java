package checkoutButton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03 {
@Test
	public void tc03() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Checkout_Functionality c= new Checkout_Functionality(driver);
		c.usernamemtab("standard_user");
		c.passwordtab("secret_sauce");
		c.loginbutton();
		c.addtocartbutton();
		c.addtocartsymbol();
		c.checkout();
		c.firstname("yash");
		c.lastname("pardeshi");
		c.zip("423109");
		c.continuetb();
			
	}
}

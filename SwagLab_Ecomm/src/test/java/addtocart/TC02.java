package addtocart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02 {
 @Test
	public void TC02() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Addtocart a=new Addtocart(driver); 
		a.usernamemtab("standard_user");
		a.passwordtab("secret_sauce");
		a.loginbutton();
		a.addtocartbutton();
		a.addtocartfunction();
		
	
	}
}

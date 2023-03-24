package POM_LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01SL_Login {
    
	@Test
	public void tc01() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		SL_LoginPage p=new SL_LoginPage(driver); 
		p.usernamemtab("standard_user");
		p.passwordtab("secret_sauce");
		p.loginbutton();
		
		String title=driver.getTitle();
		if(title.equals("Swag Labs")) {
			System.out.println("Test Case 01 is Passed");
		}
		else {
			System.out.println("Test case 01 is Failed");
		}
		}


	
}

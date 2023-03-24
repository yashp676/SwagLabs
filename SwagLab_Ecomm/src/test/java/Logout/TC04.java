package Logout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04 {

	@Test
	public void Tc04() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Logout_Funct f = new Logout_Funct(driver);
		f.usernamemtab("standard_user");
		f.passwordtab("secret_sauce");
		f.loginbutton();
		f.menubutton();
		Thread.sleep(2000);
		f.logout();
	}
}

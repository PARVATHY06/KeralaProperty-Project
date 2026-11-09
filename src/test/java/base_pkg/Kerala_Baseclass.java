package base_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_pkg.Kerala_Homepage;
import page_pkg.Kerala_loginpage;

public class Kerala_Baseclass {
	
	public static WebDriver driver;
	
	public Kerala_loginpage kerala_loginobj;
	
	public Kerala_Homepage kerala_homeobj;
	
	@BeforeTest
	public void kerala_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void kerala_objmthd()
	{
		kerala_loginobj=new Kerala_loginpage(driver);
		kerala_homeobj=new Kerala_Homepage(driver);
		
	}

	
}



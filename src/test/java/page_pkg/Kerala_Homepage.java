package page_pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Kerala_Homepage {
	
	WebDriver driver;
    Select obj;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a")WebElement addproperty;
    @FindBy(xpath="//*[@id=\"proptype\"]")WebElement property_for;
    @FindBy(xpath="//*[@id=\"listtype\"]")WebElement Listing_plan;
    @FindBy(xpath="//*[@id=\"proplabel\"]")WebElement property_label;
    @FindBy(xpath="//*[@id=\"propcategory\"]")WebElement category ;
    @FindBy(xpath="//*[@id=\"propcost\"]")WebElement exp_price ;
    @FindBy(xpath="//*[@id=\"propbeds\"]")WebElement beds ;
    @FindBy(xpath="//*[@id=\"propbaths\"]")WebElement baths ;
    @FindBy(xpath="//*[@id=\"district\"]")WebElement dist ;
    @FindBy(xpath="//*[@id=\"proplocation\"]")WebElement location ;
    @FindBy(xpath="//*[@id=\"propaddress\"]")WebElement address ;
    @FindBy(xpath="//*[@id=\"introlabel\"]")WebElement title_adv ;
    @FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/iframe")WebElement frame_tag ;
    @FindBy(xpath="/html/body")WebElement  summary;
    @FindBy(xpath="//*[@id=\"sub_frmproperty\"]")WebElement  submit;
    
    public Kerala_Homepage(WebDriver driver) {
    	
    	this.driver=driver;
		PageFactory.initElements(driver, this);    	
	}
    
    public void addpropertydetails_mthd() 
    {
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 addproperty.click();
    	 
    	 obj=new Select(property_for);
    	 obj.selectByValue("sale");
    	 
    	 obj=new Select(Listing_plan);
    	 obj.selectByValue("featured");
    	 
    	 property_label.sendKeys("34home");
    	 
    	 obj=new Select(category);
    	 obj.selectByValue("4");
    	 
    	 exp_price.sendKeys("400000");
    	  
    	 beds.sendKeys("7");
    	 
    	 baths.sendKeys("4");
    	 
    	 obj=new Select(dist);
    	 obj.selectByVisibleText("Pathanamthitta");
    	 
    	 obj=new Select(location);
    	 obj.selectByVisibleText("Kozhencherry");
    	 
    	 address.sendKeys("home2ernakulam po");
    	 
    	 title_adv.sendKeys("good data");
 		 
    	 driver.switchTo().frame(frame_tag);
    	 
   	     summary.click();
		 summary.sendKeys("abcdef");
		
		driver.switchTo().defaultContent();
		
		submit.click();
    }

}

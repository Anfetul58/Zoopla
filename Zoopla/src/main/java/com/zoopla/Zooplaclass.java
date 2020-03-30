package com.zoopla;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Zooplaclass {


WebDriver driver;

public void openbrowser() {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\apon2\\eclipse-workspace\\Zoopla\\src\\main\\resources\\driver\\chromedriver.exe");
driver = new ChromeDriver();

}
 public void maximizeBrowser() {
	 
	 driver.manage().window().maximize();
 }

 public void getUrl() {
	 
driver.get("https://www.zoopla.co.uk/");
	 }

public void getsingin() {
	driver.findElement(By.xpath("//*[@href='/signin/']")).click();
	driver.findElement(By.xpath("//*[@name='signin_email']")).sendKeys("anfetul@gmail.com");
	driver.findElement(By.xpath("//*[@name='signin_password']")).sendKeys("01787844858");
	driver.findElement(By.xpath("(//*[@name='action:signin'])[2]")).click();	
}

public void getsearch() {
	
	
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("New York, Lincolnshire");
    driver.findElement(By.xpath("//*[@class='button button--primary']")).click();	
   
}

public void closepopup() {
	
	driver.findElement(By.xpath("//*[@class='ui-modal__close close-button']")).click();
}

public void getprice() {
	
	
	List<WebElement> PropertyXpath = driver.findElements(By.xpath("//*[@class='listing-results-price text-price']"));	
	ArrayList<String> Stringprice = new ArrayList<String>();
	
    for(int i=0;i<PropertyXpath.size();i++) {
    	Stringprice.add(PropertyXpath.get(i).getText());
    	
    }
         
    System.out.println(Stringprice);
}



public void selectfifthproperty() {
	driver.findElement(By.xpath("(//*[@class='listing-results-price text-price'])[5]")).click();

	
	
}

public void verifylogo() {
	WebElement logo = driver.findElement(By.xpath("//*[@class='js-lazy-loaded']"));
    System.out.println("logo is on page " + logo.isDisplayed());
	
	
}

public void verifyagentname() {
	WebElement agent = driver.findElement(By.xpath("//*[@class='ui-agent__name']"));
	System.out.println("agent is on page"+ agent.getText());
}


public void verifyphonenumber() {
	WebElement number = driver.findElement(By.xpath("(//*[@class='ui-link'])[3]"));
	System.out.println("number is on page"+ number.getText());
	
}






public void getsignout() {
	Actions action =new Actions(driver);
	WebElement myZooplaBtn = driver.findElement(By.xpath("//*[@href='https://www.zoopla.co.uk/myaccount/']"));
	action.moveToElement(myZooplaBtn);
	
	WebElement signOut = driver.findElement(By.xpath("//*[@class='ui-icon icon-signout']"));
	action.moveToElement(signOut);
	action.click().build().perform();
	
	
}
















}

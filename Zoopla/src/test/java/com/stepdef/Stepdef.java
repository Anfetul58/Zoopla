package com.stepdef;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	
	WebDriver driver;
	
	
	@Given("User  Opens Browser")
	public void user_Opens_Browser() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	   
	}

	@When("User goes to Zoopla website")
	public void user_goes_to_Zoopla_website() {
		driver.get("https://www.zoopla.co.uk/");
	 
	   
	}

	@Then("User able to close coockies")
	public void user_able_to_close_coockies() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		Thread.sleep(1000);
	   
	}

	@When("User enters username")
	public void user_enters_username() {
		driver.findElement(By.xpath("//*[@Class='button button--tertiary-dark account-link__text']")).click();
		driver.findElement(By.xpath("//*[@name='signin_email']")).sendKeys("anfetul@gmail.com");
		
	   
	}

	@When("User enters password")
	public void user_enters_password() {
		driver.findElement(By.xpath("//*[@name='signin_password']")).sendKeys("01787844858");
	 
	   
	}

	@When("User clicks sign in")
	public void user_clicks_sign_in() {
		driver.findElement(By.xpath("(//*[@name='action:signin'])[2]")).click();
	 
	   
	}

	@Then("User is signed in")
	public void user_is_signed_in() {
		
	}

	@When("User enters in search")
	public void user_enters_in_search() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("New York, Lincolnshire");
	 
	   
	}

	@Then("User clicks to  search")
	public void user_clicks_to_search() {
		driver.findElement(By.xpath("//*[@class='button button--primary']")).click();
	 
	   
	}

	@Then("User able to close pop up")
	public void user_able_to_close_pop_up() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='ui-modal__close close-button']")).click();
	 
	   
	}

	@Then("User find all price")
	public void user_find_all_price() {
		List<WebElement> PropertyXpath = driver
				.findElements(By.xpath("//*[@class='listing-results-price text-price']"));
		ArrayList<String> Stringprice = new ArrayList<String>();

		for (int i = 0; i < PropertyXpath.size(); i++) {
			Stringprice.add(PropertyXpath.get(i).getText());
		}
		System.out.println(Stringprice);
	 
	   
	}

	@Then("User able to select fifth property")
	public void user_able_to_select_fifth_property() {
		driver.findElement(By.xpath("(//*[@class='listing-results-price text-price'])[5]")).click();

	 
	   
	}

	@Then("User able to verify logo")
	public void user_able_to_verify_logo() {
		WebElement logo = driver.findElement(By.xpath("//*[@class='js-lazy-loaded']"));
		System.out.println("logo is on page " + logo.isDisplayed());
	 
	   
	}

	@Then("User able to verify agent name")
	public void user_able_to_verify_agent_name() {
		WebElement agent = driver.findElement(By.xpath("//*[@class='ui-agent__name']"));
		System.out.println("agent is on page" + agent.getText());
	 
	   
	}

	@Then("User able to verify phone number")
	public void user_able_to_verify_phone_number() {
		WebElement number = driver.findElement(By.xpath("(//*[@class='ui-link'])[3]"));
		System.out.println("number is on page" + number.getText());
	 
	   
	}

	@Then("User able to sign out")
	public void user_able_to_sign_out() {
		Actions action = new Actions(driver);
		WebElement myZooplaBtn = driver.findElement(By.xpath("//*[@href='https://www.zoopla.co.uk/myaccount/']"));
		action.moveToElement(myZooplaBtn);
		WebElement signOut = driver.findElement(By.xpath("//*[@class='ui-icon icon-signout']"));
		action.moveToElement(signOut);
		action.click().build().perform();
	 
	   
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

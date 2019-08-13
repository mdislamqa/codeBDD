package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	//https://ui.freecrm.com/
	WebDriver driver;
	
	
	
	@Given("^User is already on login page$")
	public void User_is_already_on_login_page() {
		 driver = new ChromeDriver();
		 driver.get("https://classic.crmpro.com/login.cfm");
		
	   
	}

	@When("^Title of login page is Free CRM$")
	public void Title_of_login_page_is_Free_CRM(){
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO Log In Screen", title);
	    
	}

	@Then("^User enter \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
	public void User_enter_username_and_password(String username, String password)  {
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		
	    
	}

	@Then("^User click on submit button$")
	public void User_click_on_submit_button() {
		
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
	  
	}

	@Then("^User is on Home page$")
	public void User_is_on_Home_page(){
		//CRMPRO  - CRM software for customer relationship management, sales, and support.
		String titles=driver.getTitle();
		System.out.println("Login page Title :: "+titles);
		//Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", titles);
		
	}



}

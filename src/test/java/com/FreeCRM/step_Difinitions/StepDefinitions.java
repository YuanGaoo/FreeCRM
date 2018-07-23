package com.FreeCRM.step_Difinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.FreeCRM.utilities.ConfigurationReader;
import com.FreeCRM.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	
	@Given("user is already on Login Page")
	public void user_is_already_on_Login_Page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		
	}

	@When("title of login page is FREE CRM")
	public void title_of_login_page_is_FREE_CRM() {
		 System.out.println("title of login page is Free CRM");
		    String title=Driver.getDriver().getTitle();
		   assertEquals("Free CRM software in the cloud powers sales and customer service", 
		    		title);
	}

	@Then("user enters username {string} and password{string}")
	public void user_enters_username_and_password(String username, String password) {
		System.out.println("user name and password is here ");
		Driver.getDriver().findElement(By.name("username")).sendKeys(username);
		Driver.getDriver().findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	 System.out.println("user click on login button");
	 WebElement loginbtn=Driver.getDriver().findElement(By.xpath("//input[@value='Login']"));
	 JavascriptExecutor is = (JavascriptExecutor) Driver.getDriver();
	 is.executeScript("arguments[0].click()", loginbtn);
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("user is on home page");
	    String title=Driver.getDriver().getTitle();
	    assertEquals("CRMPRO", title);
	}
	@Then("user moves to new contact page")
	public void user_moves_to_new_contact_page() {
	 Driver.getDriver().switchTo().frame("mainpanel");
	 Actions action= new Actions(Driver.getDriver());
	 action.moveToElement(Driver.getDriver()
			 .findElement(By.xpath("//a[.='Contacts']"))).build().perform();
	 Driver.getDriver().findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}

	@Then("user enters firstname{string} and lastname{string} and position{string}")
	public void user_enters_firstname_and_lastname_and_position(String firstname, String lastname, String position) {
	    Driver.getDriver().findElement(By.id("first_name")).sendKeys(firstname);
	    Driver.getDriver().findElement(By.id("surname")).sendKeys(lastname);
	    Driver.getDriver().findElement(By.id("company_position")).sendKeys(position);
	    Driver.getDriver().findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();

	}

	@Then("close the browser")
	public void close_the_browser() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		//Driver.getDriver().quit();
	}

}

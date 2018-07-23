package com.FreeCRM.step_Difinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.FreeCRM.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class DealStepDefinition {

	
//	@When("title of login page is FREE CRM")
//	public void title_of_login_page_is_FREE_CRM() {
//		 System.out.println("title of login page is Free CRM");
//		    String title=Driver.getDriver().getTitle();
//		   assertEquals("Free CRM software in the cloud powers sales and customer service", 
//		    		title);
//	}

	
	@Then("user enters username username and password password")
	public void user_enters_username_username_and_password_password(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
//		List<String> data = dataTable.row(0);
//		 Driver.getDriver().findElement(By.name("username")).sendKeys(data.get(0).toString());
//		 Driver.getDriver().findElement(By.name("password")).sendKeys(data.get(1).toString());
//		 
		for (Map<Object, Object> data: dataTable.asMaps(String.class, String.class)) {
			Driver.getDriver().findElement(By.name("username")).sendKeys(data.get("username").toString());
			Driver.getDriver().findElement(By.name("password")).sendKeys(data.get("password").toString());
		}
		
	   
	}

	@Then("user moves to new deals page")
	public void user_moves_to_new_deals_page() {
		Driver.getDriver().switchTo().frame("mainpanel");
		 Actions action= new Actions(Driver.getDriver());
		 action.moveToElement(Driver.getDriver()
				 .findElement(By.xpath("//a[.='Deals']"))).build().perform();
		 Driver.getDriver().findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}

	@Then("user enters deal details")
	public void user_enters_deal_details(DataTable dealData) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
//		List<String> dealTable = dealData.row(0);
//		Driver.getDriver().findElement(By.id("title")).sendKeys(dealTable.get(0));
//		Driver.getDriver().findElement(By.id("amount")).sendKeys(dealTable.get(1));
//		Driver.getDriver().findElement(By.id("probability")).sendKeys(dealTable.get(2));
//		Driver.getDriver().findElement(By.id("commission")).sendKeys(dealTable.get(3));
		
		for (Map<Object, Object> data : dealData.asMaps(String.class, String.class)) {
			
			Driver.getDriver().findElement(By.id("title")).sendKeys(data.get("title").toString());
			Driver.getDriver().findElement(By.id("amount")).sendKeys(data.get("amount").toString());
			Driver.getDriver().findElement(By.id("probability")).sendKeys(data.get("probablity").toString());
			Driver.getDriver().findElement(By.id("commission")).sendKeys(data.get("commission").toString());
			
			Driver.getDriver().findElement(By.xpath("//input[@value='Save' and @type='submit']")).click();
			
			 Actions action= new Actions(Driver.getDriver());
			 action.moveToElement(Driver.getDriver()
					 .findElement(By.xpath("//a[.='Deals']"))).build().perform();
			 Driver.getDriver().findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		}
		

		
	}
}

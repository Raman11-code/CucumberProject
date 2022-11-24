package stepDefinitions;

import java.time.Duration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestConTextSetup;

public class OfferPageStepDefinition {
	public String OffersPgaeProductname;
	TestConTextSetup testContextSetup;

	public OfferPageStepDefinition(TestConTextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Then("User Searched for same Shortname {string} in offers page to check if Product exist")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String product)
			throws InterruptedException {
		SwitchToOffersPage();
		Thread.sleep(2000);
		testContextSetup.driver.findElement(By.id("search-field")).sendKeys(product);
		Thread.sleep(2000);
		OffersPgaeProductname = testContextSetup.driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/table/tbody/tr/td[1]")).getText();
		System.out.println(OffersPgaeProductname);
	}
	
	public void SwitchToOffersPage() {
		testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
		Set<String> windows = testContextSetup.driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String ChildID = it.next();
		testContextSetup.driver.switchTo().window(ChildID);
		
	}
	/*
	 * @And("validate product name in offers page matches with Landing page") public
	 * void validate_product_name_in_offers_page_matches_with_Landing_page() {
	 * Assert.assertEquals(OffersPgaeProductname, LandingpageProductname);
	 * //Assert.assertEquals();
	 * 
	 * }
	 */
}

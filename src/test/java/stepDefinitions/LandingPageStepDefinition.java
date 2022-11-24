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

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String LandingpageProductname;
	public String OffersPgaeProductname;
	TestConTextSetup testContextSetup;

	public LandingPageStepDefinition(TestConTextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiit\\Music\\chromedriver.exe");
		testContextSetup.driver = new ChromeDriver();
		testContextSetup.driver.manage().window().maximize();
		testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("User searched with shortname {string} and extracted actual name of Product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String product)
			throws InterruptedException {
		testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(product);
		Thread.sleep(2000);

		// We can generate CSS by tagname.classname
		LandingpageProductname = testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText()
				.split("-")[0].trim();
		System.out.println(LandingpageProductname);

	}

}
/*
 * @And("validate product name in offers page matches with Landing page") public
 * void validate_product_name_in_offers_page_matches_with_Landing_page() {
 * Assert.assertEquals(OffersPgaeProductname, LandingpageProductname);
 * //Assert.assertEquals();
 * 
 * }
 */

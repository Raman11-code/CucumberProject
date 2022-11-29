package stepDefinitions;

import java.time.Duration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestConTextSetup;

public class samplepageTestStepDefinition {
	public WebDriver driver;
	public String LandingpageProductname;
	public String OffersPgaeProductname;
	TestConTextSetup testContextSetup;

	public samplepageTestStepDefinition(TestConTextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}


	  @Given("^User has entered the (.+)$")
	    public void user_has_entered_the(String url) {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiit\\Music\\chromedriver.exe");
			testContextSetup.driver = new ChromeDriver();
			testContextSetup.driver.manage().window().maximize();
			testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			testContextSetup.driver.get("https://www.globalsqa.com/samplepagetest/");
			testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			
		

	        
	    }


	    @Then("^user enters name in the inputfield$")
	    public void user_enters_name_in_the_inputfield() throws Throwable {
	    	
	    	testContextSetup.driver.findElement(By.id("g2599-name")).sendKeys("Albert Ross");
	        
	    }

	    @Then("^user provide valid email credential in th input field$")
	    public void user_provide_valid_email_credential_in_th_input_field() throws Throwable {
	    	
	    	testContextSetup.driver.findElement(By.id("g2599-email")).sendKeys("albert@123.com");
	    	Thread.sleep(1000);
	       
	    }

	    @Then("user provide any sample website in the UI")
	    public void user_provide_any_sample_website_in_the_ui() throws InterruptedException {
	    	testContextSetup.driver.findElement(By.id("g2599-website")).sendKeys("https://abc.com");
	        Thread.sleep(1000);
	    }
	    @Then("^user select desired experience from the dropdown List$")
	    public void user_select_desired_experience_from_the_dropdown_list() throws Throwable {
	    	//g2599-experienceinyears
	    	WebElement staticDropdown =testContextSetup. driver.findElement(By.id("g2599-experienceinyears"));
	    	Select Dropdown = new Select (staticDropdown);
	    	Dropdown.selectByValue("3-5");
	    	
	    	 Thread.sleep(1000);
	      
	    }

	    @Then("User should be able to select expertise checkbox")
	    public void user_should_be_able_to_select_expertise_checkbox() {
	        // Write code here that turns the phrase above into concrete actions
	    	testContextSetup.driver.findElement(By.xpath("//input[@value =\"Automation Testing\"]")).click();
	    }

	    @Then("user should select highest education")
	    public void user_should_select_highest_education() throws InterruptedException {
	        // Write code here that turns the phrase above into concrete actions
	    	
	    	
	    	testContextSetup.driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[6]/label[2]")).click();
	        Thread.sleep(1000);
	    }

	    @Then("^user need to provide comment in the input field$")
	    public void user_need_to_provide_comment_in_the_input_field() throws Throwable {
	    	testContextSetup.driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("No comment Added"); 
	    	
	    	
	    }

	    @Then("User click on the Submit button")
	    public void user_click_on_the_submit_button() throws InterruptedException {
	        // Write code here that turns the phrase above into concrete actions
	      Thread.sleep(3000);
	      testContextSetup.driver.findElement(By.cssSelector("button.pushbutton-wide")).click();
	    }

	 
	}
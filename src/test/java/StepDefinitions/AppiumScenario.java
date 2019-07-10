package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import Utility.Hook;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class AppiumScenario {

private WebDriver driver;
	
	public AppiumScenario() {
		this.driver = Hook.getDriver();
	}
	
//	@Given("^I open the application$")
//	public void i_open_the_application() throws Throwable {
//	    Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Accessibility']")).isDisplayed());
//	}



	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
	}


	@And("^Fill ([^\"]*) element with \"([^\"]*)\" text$")
	public void fill_id_wisth_elementtttt(String word, String word2) throws Throwable {

		try {

			driver.findElement(By.id(word)).sendKeys(word2);
		} catch (Exception e) {

			throw new Throwable();
		}
	}


	@And("^Click ([^\"]*) id")
	public void click (String word) throws Throwable {


		driver.findElement(By.id(word)).click();
	}

	@And("^Click ([^\"]*) xpath$")
	public void with_xpath(String word) throws Throwable {


		driver.findElement(By.xpath(word)).click();
	}


	@And("^Click ([^\"]*) element$")
	public void with_elemensst(String word) throws Throwable {


		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/compass.properties");

		InputStreamReader inputStreamReader = new InputStreamReader(objfile, "ISO-8859-9");

		Properties obj = new Properties();
		obj.load(inputStreamReader);

		driver.findElement(By.xpath(obj.getProperty(word))).click();




	}
	@When("^I tap on Accessibility$")
	public void i_tap_on_Accessibility() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Accessibility']")).click();
	}

	@Then("^I validate Custom View$")
	public void i_validate_Custom_View() throws Throwable {
	  Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Custom View']")).isDisplayed(), "Custom View is not displayed");
	  
	}

	@And("^I See ([^\"]*) id$")
	public void iSeeEmpty_textview(String word) {
		driver.findElement(By.id(word));
	}
}

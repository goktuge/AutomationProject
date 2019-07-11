package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Utility.Hook;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class MobileSteps {

private WebDriver driver;
	
	public MobileSteps() {
		this.driver = Hook.getDriver();
	}



	@Given("^I check ([^\"]*) id$")
	public void i_check_id(String word){
		Assert.assertTrue(driver.findElement(By.id(word)).isDisplayed());
	}


	@And("^Fill ([^\"]*) element with \"([^\"]*)\" text$")
	public void fill_id_with_element(String word, String word2) throws Throwable {

		try {

			driver.findElement(By.id(word)).sendKeys(word2);
		} catch (Exception e) {

			throw new Throwable();
		}
	}


	@And("^Tap ([^\"]*) id")
	public void tap_id (String word){


		driver.findElement(By.id(word)).click();
	}

	@And("^Tap ([^\"]*) xpath$")
	public void tap_xpath(String word){

		driver.findElement(By.xpath(word)).click();
	}


	@And("^Tap ([^\"]*) element$")
	public void tap_element(String word) throws Throwable {


		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/compass.properties");

		InputStreamReader inputStreamReader = new InputStreamReader(objfile, "ISO-8859-9");

		Properties obj = new Properties();
		obj.load(inputStreamReader);

		driver.findElement(By.xpath(obj.getProperty(word))).click();

	}
}

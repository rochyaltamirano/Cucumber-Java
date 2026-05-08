package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	WebDriver driver;
	
	@Given ("the user is in the Product page")
	public void theUserIsInProductPage() {
		System.setProperty("webdriver.chrome.driver", "../CucumberTest/Drivers/chromedriver");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://automationexercise.com/products");
	}
	
	@When("the user enters Tshirt in the search bar")
	public void userEntersTshirtInTheSearchBar() {
		driver.findElement(By.id("search_product")).sendKeys("tshirt");
	}
	
	@When("the user clicks the search button")
	public void userClicksTheSearchButton() {
		driver.findElement(By.id("submit_search")).click();
	}
	
	@Then ("the Tshirt page appears")
	public void tShirtPage () {
		String title = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
	
		Assert.assertEquals(title, "SEARCHED PRODUCTS");
		
	}
}

package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.*;

public class GoogleSearch {
	
	
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
	    System.out.println("browser is open");
	    
	}
	

	@And("the user see the search bar")
	public void the_user_see_the_search_bar() {
		driver.navigate().to("https://www.google.com/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role='presentation']")));
		WebElement stay = driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView()",stay);
		stay.click();
				
		
		//driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.ENTER);
	    System.out.println("the user see the search bar");
	}

	@When("user enters text in search bar")
	public void user_enters_text_in_search_bar() {
	    System.out.println("user enters text in search bar");
	}

	@And("hit enter button")
	public void hit_enter_button() {
	    System.out.println("hit enter button");
	}

	@Then("serarch results are displayed")
	public void serarch_results_are_displayed() {
	    System.out.println("serarch results are displayed");
	}

}

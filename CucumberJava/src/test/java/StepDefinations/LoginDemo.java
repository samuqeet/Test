package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemo {
	WebDriver driver;

	@Given("browser is opened")
	public void browser_is_opened() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		System.out.println("browser is opened");
	}

	@And("login page is visible")
	public void login_page_is_visible() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("orangehrm")) {
			System.out.println("login page is visible");
		} else {
			System.out.println("login page is not visible");
		}

	}

	@When("^the (.*) and (.*) is entered$")
	public void the_username_and_password_is_entered(String username, String password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		System.out.println("the username and password is entered");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		System.out.println("user clicks on login button");
	}

	@Then("user is logged in to homepage")
	public void user_is_logged_in_to_homepage() {
		WebElement logo = driver.findElement(By.xpath("//img[@src='/web/images/orangehrm-logo.png?v=1721393199309']"));
		if (logo.isDisplayed()) {
			System.out.println("user is logged in to homepage");
		} else {
			System.out.println("user is not logged in to homepage");
		}

	}
}

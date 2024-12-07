package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginbutton = By.xpath("//button[@type='submit']");
	
	public void enterusername(String username) {
		driver.findElement(this.username).sendKeys(username);
		
	}
	public void enterpassword(String password) {
		driver.findElement(this.password).sendKeys(password);
	}
	
	public void loginbutton() {
		driver.findElement(loginbutton).click();
	}
}

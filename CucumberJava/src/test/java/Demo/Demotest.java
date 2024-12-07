package Demo;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demotest {

	
	
	WebDriver driver;
	public void openbrowser() {
		
	driver = new ChromeDriver();
	driver.manage().window().fullscreen();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	//explicit wait
	Wait<WebDriver> ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
	ewait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("user")));
	
	//fluent wait
	Wait<WebDriver> fwait = new FluentWait<>(driver)
							.withTimeout(Duration.ofSeconds(10))
							.pollingEvery(Duration.ofSeconds(5))
							.ignoring(ElementNotInteractableException.class);
	fwait.until(ExpectedConditions.elementSelectionStateToBe(By.id("user"), false));
	
	//screenshot
	File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 
	
	}
	
}

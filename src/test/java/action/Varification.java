package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Varification {
	WebDriver driver;
	@Test
	public void webElement() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		WebElement username = driver.findElement(By.id("input-email"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("naharshumson@gmail.com");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("Farabi1234");
		
		WebElement loginButton = driver.findElement(By.cssSelector("a.btn.btn-primary"));
		loginButton.isDisplayed();
		loginButton.isEnabled();
		loginButton.click();
		
		WebElement element = driver.findElement(By.linkText("Qafox.com"));
		String ActualValue =element.getText();
		System.out.println(element.getText());
		String ExpectedValue = "Qafox.com";
		if(ActualValue==ExpectedValue) {
			System.out.println("Test cases passed");
		}else {
			System.out.println("Test cases failed");
		}
		//Assert.assertEquals(ActualValue,ExpectedValue);
		
		driver.quit();
		
	}

}

package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {
	WebDriver driver;
	@Test
	public void actionTest() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		Actions act = new Actions(driver);
		
		WebElement current =driver.findElement(By.linkText("Desktops"));
		WebElement ox =driver.findElement(By.linkText("Laptops & Notebooks"));
		WebElement desktop =driver.findElement(By.linkText("Components"));
		
		act.moveToElement(current).build().perform();
		Thread.sleep(3000);
		act.moveToElement(ox).build().perform();
		Thread.sleep(3000);
		act.moveToElement(desktop).click().build().perform();
		Thread.sleep(3000);
		act.moveToElement(current).moveToElement(ox).moveToElement(desktop).click().perform();
		driver.quit();
		
		
		
	}

}

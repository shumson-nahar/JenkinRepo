package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenApplication {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shumson Nahar\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chrome.exe");
		ChromeOptions option = new ChromeOptions();
		driver.get("https://en.wikipedia.org/wiki/Facebook");
		//option.setBinary("C:\\Users\\Shumson Nahar\\Downloads\\chrome-win64\\chrome.exe");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(200);
		System.out.println(driver.getCurrentUrl());
		
		
				
	}

}

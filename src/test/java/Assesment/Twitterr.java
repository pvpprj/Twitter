package Assesment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Twitterr extends Base {
	
	@BeforeTest
	public void Initializer() throws IOException, InterruptedException {
		driver = InitializingDriver();
		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
	}
	
	@Test()
	public void ProfileSet() throws IOException, Exception {
		
		LoginPage l = new LoginPage(driver);
		
		l.signin().click();
		Thread.sleep(2000);
		
		l.username().sendKeys(p.getProperty("username"));
		Thread.sleep(2000);
		l.password().sendKeys(p.getProperty("password"));
		Thread.sleep(2000);
		l.Submit().click();
		Thread.sleep(2000);
		
		l.Profile1().click();
		Thread.sleep(2000);
		
		l.EditProfile().click();
		Thread.sleep(2000);
		
		l.Name().clear();
		l.Name().sendKeys("Rahul");
		Thread.sleep(2000);
		
		l.Bio().clear();
		l.Bio().sendKeys("My Name is Rahul");
		Thread.sleep(2000);
		
		l.Location().clear();
		l.Location().sendKeys("Mumbai");
		Thread.sleep(2000);
		
		l.Website().clear();
		l.Website().sendKeys("https://twitter.com/settings/profile");
		Thread.sleep(2000); 
		
		l.Save().click();
		Thread.sleep(2000);  
	
	}
	
	@Test()
	public void Twit() throws IOException, Exception {
		LoginPage l = new LoginPage(driver);
		
		l.Home().click();
		Thread.sleep(2000);
		
		l.TweetText().sendKeys("Post");;
		Thread.sleep(2000);  
		
		l.Tweet().click();
		Thread.sleep(2000);  
		
		l.Favorite().click();
		Thread.sleep(2000); 
		
		l.Delete().click();
		Thread.sleep(2000); 
		
		l.Delete1().click();
		Thread.sleep(2000); 
		
		l.Delete2().click();
		Thread.sleep(2000); 
		
	}
	
	@AfterTest
	public void close() throws InterruptedException {
	LoginPage l = new LoginPage(driver);
		l.Logout1().click();
		Thread.sleep(2000);
		l.Logout2().click();
		Thread.sleep(2000);
		l.Logout3().click();
		Thread.sleep(2000);
	
		driver.close();
	}
	
	
}

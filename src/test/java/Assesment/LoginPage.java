package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//By website=By.xpath("");  
	
	public WebDriver driver;
	
	By home=By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/a[1]/div[1]/div[2]/span[1]");  
	By sign=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/div[1]");
	
	By newAcc= By.xpath("//a[@id='createAccountSubmit']");
	By username=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]/div[1]/div[2]/div[1]/input[1]"); 
	By password=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/div[1]/div[2]/div[1]/input[1]");
	By submit=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]");
	By profile=By.xpath("//span[contains(text(),'Profile')]");
	By editProfile=By.xpath("//span[contains(text(),'Edit profile')]");
	By name=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/label[1]/div[1]/div[2]/div[1]/input[1]");
	By save=By.xpath("//span[contains(text(),'Save')]");
	By bio=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[4]/label[1]/div[1]/div[2]/div[1]/textarea[1]");
	By location=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/label[1]/div[1]/div[2]/div[1]/input[1]");
	By website=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/label[1]/div[1]/div[2]/div[1]/input[1]");
	
	By logout1=By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]");
	By logout2=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/div[1]/div[1]/span[1]/span[1]");
	By logout3=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/span[1]/span[1]");
	By tweetText=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]");
	By tweet=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[3]/div[1]/span[1]/span[1]");  
	By favorite=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]"); 
	By delete=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/*[1]");  
	By delete1=By.xpath("//span[contains(text(),'Delete')]");  
	By delete2=By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/span[1]/span[1]");  
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;	
	}

	public WebElement signin()
	{
		return driver.findElement(sign);
	}
	
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement Profile1()
	{
		return driver.findElement(profile);
	}
	
	public WebElement EditProfile()
	{
		return driver.findElement(editProfile);
	}
	
	public WebElement Name()
	{
		return driver.findElement(name);
	}
		
	public WebElement Save()
	{
		return driver.findElement(save);
	}
	
	public WebElement Bio()
	{
		return driver.findElement(bio);
	}
	
	public WebElement Location()
	{
		return driver.findElement(location);
	}
	
	public WebElement Website()
	{
		return driver.findElement(website);
	}
	
	public WebElement Logout1()
	{
		return driver.findElement(logout1);
	}
	
	public WebElement Logout2()
	{
		return driver.findElement(logout2);
	}
	
	public WebElement Logout3()
	{
		return driver.findElement(logout3);
	}
	
	public WebElement TweetText()
	{
		return driver.findElement(tweetText);
	}
	
	public WebElement Tweet()
	{
		return driver.findElement(tweet);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}
	
	public WebElement Favorite()
	{
		return driver.findElement(favorite);
	}
	
	public WebElement Delete()
	{
		return driver.findElement(delete);
	}

	public WebElement Delete1()
	{
		return driver.findElement(delete1);
	}

	public WebElement Delete2()
	{
		return driver.findElement(delete2);
	}





}

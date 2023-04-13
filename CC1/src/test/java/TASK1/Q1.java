package TASK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1 {
public static void main(String arg[])
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	WebElement user=driver.findElement(By.id("user-name"));
	user.sendKeys("standard_user");
	
	WebElement pw=driver.findElement(By.id("password"));
	pw.sendKeys("secret_sauce");
	
	WebElement login=driver.findElement(By.id("login-button"));
	login.click();
	
	driver.get("https://www.saucedemo.com/inventory.html");
	//driver.navigate().to("https://www.saucedemo.com/inventory-item.html?id=4");
	WebElement add=driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
	add.click();
	
	WebElement view=driver.findElement(By.id("shopping_cart_container"));
	view.click();
	
	WebElement chk=driver.findElement(By.id("checkout"));
	chk.click();
	
	WebElement fname=driver.findElement(By.id("first-name"));
	fname.sendKeys("Light");
	
	WebElement lsnam=driver.findElement(By.id("last-name"));
	lsnam.sendKeys("yagami");
	
	WebElement code=driver.findElement(By.id("postal-code"));
	code.sendKeys("625001");
	
	WebElement con=driver.findElement(By.id("continue"));
	con.click();
	
	WebElement product=driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
    System.out.println("Product name: "+product.getText());
    
    WebElement price=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
    System.out.print("price" +price.getText());
    
	String Exceptedtitle = "Swag Labs";
	String Actualtitle = driver.getTitle();
	if(Exceptedtitle.equals(Actualtitle))
	{
	System.out.println("Title is valid");
	}
	else
	{
	System.out.println("Title is not valid");
	}
	
	String Exceptedurl = "https://www.saucedemo.com/checkout-step-two.html";
	String Actualurl = driver.getCurrentUrl();
	if(Exceptedurl.equals(Actualurl))
	{
	System.out.println("url is valid");
	}
	else
	{
	System.out.println("url is not valid");
	}
	
	
}
}

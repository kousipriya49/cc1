package TASK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {
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
	
	WebElement fil=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	fil.click();
	
	Select se=new Select(fil);
	se.selectByIndex(0);		
	WebElement product1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
	System.out.println("Product name: "+product1.getText());
	
	WebElement fil1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	fil1.click();
	Select se1=new Select(fil1);
	se1.selectByIndex(1);
	WebElement product2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
	System.out.println("Product name: "+product2.getText());
	
	WebElement fil2=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	fil2.click();
	Select se2=new Select(fil2);
	se2.selectByIndex(2);
	WebElement product3=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	System.out.println("Product name: "+product3.getText());
	
	WebElement fil3=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	fil3.click();
	Select se3=new Select(fil3);
	se3.selectByIndex(3);
	WebElement product4=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	System.out.println("Product name: "+product4.getText());
	
	
	
    
   
    
}
}

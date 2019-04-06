package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void doLogin(){
		System.out.println("Performing the Login operation");
		System.out.println("Performing the Login operation");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		printmessage();
		driver.close();
		
		
	}

	public static void printmessage(){
		System.out.println("Test");
		
		
	}
	
}

package Seleniumpriority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Prioritydemo {
	WebDriver driver = new ChromeDriver();
	
	@Test(priority = 1)
	public void login() throws InterruptedException{
		Thread.sleep(800);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(800);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath(" //button[@type = 'submit'] ")).click();
		Thread.sleep(500);
		
	}
	
	@Test(priority = 2)
	public void searchleave() throws InterruptedException {
		Thread.sleep(800);
		driver.findElement(By.xpath("//a/span[text() ='Leave']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("input[@placeholder='Type for hints...']")).sendKeys("john");
		
		//driver.findElement(By.cssSelector(".oxd-main-menu-item.active")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Virat");
		
	}
	
	//@Ignore
	@Test(priority = 3)
	public void logout() throws InterruptedException {
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(800);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	@Test(priority = 4)
	public void mlosea() {
		driver.close();
	}
}

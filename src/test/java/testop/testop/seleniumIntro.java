package testop.testop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumIntro {
	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnshulLadoo\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("Title=>"+driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Test");
		driver.findElement(By.name("inputPassword")).sendKeys("Test");
		driver.findElement(By.className("submit")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@gmail.com");
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(4)")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
//		driver.close();
//		driver.quit();
	}

}

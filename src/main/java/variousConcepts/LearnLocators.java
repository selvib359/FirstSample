package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;
	
	@Before
	public void init(){
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://objectspy.space/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}	
	
	@Test
	public void testLocators(){
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-1")).click();
		
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Selvi\\OneDrive\\Desktop\\test\\test1.txt");
		
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//driver.navigate().back();
		driver.findElement(By.partialLinkText("Backend")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input#exp-0")).click();
		
		driver.findElement(By.cssSelector("input[id='profession-1']")).click();
		
		driver.findElement(By.cssSelector("input[id='tool-2'][value='Selenium Webdriver']")).click();
		
		
		
		
		
		
		
	}
}

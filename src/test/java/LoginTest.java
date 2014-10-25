import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


//lecture 129  github continued with lecture 130
public class LoginTest {
	
	public static WebDriver driver;
	// testng jars
	@BeforeSuite
	
	public void setUp(){
		
		driver = new FirefoxDriver();
		
	}
	@Test
	public void doLogin(){
		
		driver.get("Http://gmail.com");	
		driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.id("Passwd")).sendKeys("abdc");
		
		// new code after first push to local first and then Github 10-25-14; so first do a committ;
		driver.findElement(By.id("SignIn")).click();
		
	}
	@AfterSuite 
	
	public void tearDown() {
		//Thread.sleep(2000);
		driver.quit();
	}

}

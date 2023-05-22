package githubPackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWaits {

	// 
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver update\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(option);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://phonepe.force.com/login?locale=us");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// 3 methods: 1) isEnabled 2) isDisplayed 3) isSelected
		
		WebElement txtbox_username = d.findElement(By.xpath("//input[@name='username']"));
		boolean result1 = txtbox_username.isEnabled();
		if(result1==true)
		{
			System.out.println("Username is verified & Result is="+result1);
			txtbox_username.sendKeys("admin");
		}else {
			System.out.println("Username is not verified & Result is="+result1);
		}
		
		
		WebElement txbox_password = d.findElement(By.xpath("//input[@id='password']"));
		boolean result2 = txbox_password.isEnabled();
		if(result2==true)
		{
			System.out.println("Password is verified & Result is="+result2);
			txbox_password.sendKeys("manager");
			
		}else {
			System.out.println("Password is not verified & Result is"+result2);
		}
		
		WebElement btn_Login = d.findElement(By.xpath("//input[@class='button r4 wide primary']"));
		boolean result3 = btn_Login.isDisplayed();
		if(result3==true)
		{
			System.out.println("Login button is verified & Result is="+result3);
			btn_Login.click();
			
		}else {
			System.out.println("Login button is not verified & Result is="+result3);
		}
		
		
		WebElement checkbox = d.findElement(By.xpath("//input[@name='rememberUn']"));
		boolean result4 = checkbox.isSelected();
		if(result4==false)
		{
			System.out.println("Checkbox is verified & Result is="+result4);
			checkbox.click();
		}else {
			System.out.println("Checkbox is not verified & Result is="+result4);
		}
		
		WebElement link_forgetPass = d.findElement(By.xpath("(//a)[3]"));
		boolean result5 = link_forgetPass.isDisplayed();
		if(result5==true)
		{
			System.out.println("Link is verified & Result is="+result5);
			link_forgetPass.click();
		}else {
			System.out.println("Link is not verified & Result is="+result5);
		}
		Thread.sleep(2000);
		d.quit();
		
		
	}
	
	
	
	
	
	
	
}

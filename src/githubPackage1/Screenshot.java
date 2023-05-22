package githubPackage1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[]args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver update\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(option);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://unacademy.com/goal/upsc-civil-services-examination-ias-preparation/KSCGY");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// ScreenshotOfWebPage:
		
		String path="D:\\Velocity\\selenium_screenshot\\unacademyPage1.png";
		File source = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File destination=new File(path);
		FileHandler.copy(source, destination);
		
		
		// ScreenshotOfWebElement:
		
		String p="D:\\Velocity\\selenium_screenshot\\logo_Unacademy1.png";
		WebElement logo = d.findElement(By.xpath("(//img)[1]"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest=new File(p);
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		d.quit();
		
	}
	
	
	
	
	
	
	
	
}

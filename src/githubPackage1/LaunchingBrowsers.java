package githubPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchingBrowsers implements CommonProperties {

	public static WebDriver d;
	public void launchChromeBrowser() {
		
		System.out.println("Launching chrome browser");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty(key1, value1);
		d=new ChromeDriver(option);
		d.manage().window().maximize();
		System.out.println("Launched browser successfully");
		d.get(url1);
		System.out.println("URL hitted the chrome browser successfully");
		
		
		
		
		
	}
	
	

	
	public void launchFirefoxBrowser() {
		
		
	}

}

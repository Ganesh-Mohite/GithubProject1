package githubPackage1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DimensionClass {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver update\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions(); 
		option.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(option);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://unacademy.com/goal/upsc-civil-services-examination-ias-preparation/KSCGY");
		
		
		//Dimension:
		
	Dimension size = d.manage().window().getSize();
	System.out.println("Width of the browser window="+size.getWidth());
	System.out.println("Height of the browser window="+size.getHeight());
	
	// Use of Dimension Class:
	
	Dimension s=new Dimension(400,950);
	d.manage().window().setSize(s);
		
		
	Point position = d.manage().window().getPosition();	
	System.out.println("Position of X="+position.getX());
	System.out.println("Position of Y="+position.getY());
	
	// Use of Point Class:
	
	Point p=new Point(350,750);
	d.manage().window().setPosition(p);
	
	Thread.sleep(2000);
	d.quit();
	}
	
	
	
	
	
	
	
	
}

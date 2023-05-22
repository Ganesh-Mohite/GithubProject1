package githubPackage1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver update\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(option);
		d.manage().window().maximize();
		d.get("https://www.facebook.com/signup");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// day:
		
		WebElement txtbox_day = d.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(txtbox_day);
		s.selectByValue("7");
		
		// count:
		
		List<WebElement> day_options = s.getOptions();
		
		int count_days = day_options.size();
		System.out.println("Total days="+count_days);
		
		// print:
		
	for(int i=0;i<count_days;i++)
	{
		String txt_days = day_options.get(i).getText();
		System.out.println(txt_days);
	}
		
		
	
	// month:
	
		WebElement txtbox_months = d.findElement(By.xpath("//select[@name='birthday_month']"));
		Select t=new Select(txtbox_months);
		t.selectByVisibleText("Sep");
		
	// count:
		
		List<WebElement> month_options = t.getOptions();
	
		int count_months = month_options.size();
		System.out.println("Total months="+count_months);
		
		
	// print:
		
		for(int i=0;i<count_months;i++)
		{
			
			String txt_months = month_options.get(i).getText();
			System.out.println(txt_months);
			
		}
		
		
		WebElement txtbox_years = d.findElement(By.xpath("//select[@title='Year']"));
		Select e=new Select(txtbox_years);
		e.selectByIndex(26);
		
		// count:
		
		List<WebElement> year_options = e.getOptions();
		
		int count_years = year_options.size();
		System.out.println("Total years="+count_years);
		
		
		
		// print:
		
		for(int i=0;i<count_years;i++)
		{
			
			String txt_years = year_options.get(i).getText();
			System.out.println(txt_years);
			
		}
		
		Thread.sleep(2000);
		d.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

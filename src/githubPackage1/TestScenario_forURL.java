package githubPackage1;

public class TestScenario_forURL extends LaunchingBrowsers{

	String expUrl="https://unacademy.com/goal/upsc-civil-services-examination-ias-preparation/KSCGY";
	public void verifyUrl() {
		
		String actUrl = d.getCurrentUrl();
		System.out.println(actUrl);
		if(expUrl.equalsIgnoreCase(actUrl))
		{
			System.out.println("URL is verified & Result is="+actUrl);
		}else {
			System.out.println("Something went wrong");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}

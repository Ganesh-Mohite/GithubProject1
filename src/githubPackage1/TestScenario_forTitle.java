package githubPackage1;

public class TestScenario_forTitle extends LaunchingBrowsers{

	String expTitle="UPSC CSE - GS Exam Preparation 2023 | Crack UPSC CSE - GS | Unacademy";
	public void verifyTitle() {
		
		String actTitle = d.getTitle();
		System.out.println(actTitle);
		
		if(expTitle.equalsIgnoreCase(actTitle))
		{
			System.out.println("Title is verified & Result is="+actTitle);
		}else {
			System.out.println("Title is not verified & Result is="+actTitle);
		}
		
		
	}
	
	
	
	
	
	
	
	
}

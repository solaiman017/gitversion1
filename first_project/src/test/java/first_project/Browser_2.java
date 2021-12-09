package first_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_2 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\md\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		String s=driver.getTitle();
		System.out.println(s);
		
	}

}

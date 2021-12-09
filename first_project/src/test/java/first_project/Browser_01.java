package first_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_01 {

	public static void main(String[] args) {
	
		
		//System.setProperty("webdriver.chrome.driver","C:/Users/md/Downloads/chromedriver_win32/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","C:/Users/md/Desktop/chromedriver.exe");

		//C:\Users\md\Desktop
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Set<String> windowhandle=driver.getWindowHandles();
		
	System.out.println(windowhandle);
	
	Iterator<String> iter =windowhandle.iterator();
		
	String parent=iter.next();
	String child=iter.next();
	driver.switchTo().window(child);

		
	}
	

}

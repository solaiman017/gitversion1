package sdet_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Fift_class {
	@AfterTest
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\md\\Desktop\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.get("https://www.amazon.com/");
driver.navigate().back();// snapdealdriver.navi
driver.navigate().forward();//amazon
		
driver.navigate().refresh();
		
	}

}

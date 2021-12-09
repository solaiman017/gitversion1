package sdet_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Video8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\md\\Desktop\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement d=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		
		Select drp= new Select(d);
		
		drp.selectByVisibleText("Amazon Warehouse");
		
	}

}

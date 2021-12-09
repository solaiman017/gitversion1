package sdet_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sdet_video6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\md\\Desktop\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("XYZ");
		WebElement searchbox=driver.findElement(By.xpath("//*[@id='small-searchterms']"));
		searchbox.sendKeys("XYZ");
		//2
		WebElement ele=driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]"));
		System.out.println(ele.getText());
		//System.out.println(ele.getSize());
		//3
		//driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
		
		//findElement---- return multi web elements
		//driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]"));
		List<WebElement>links=driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
		
		System.out.println("number of elements capture:"+links.size());
		//2
	
		List<WebElement> logo=driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		System.out.println(logo.size());
		
		
		
	}

}

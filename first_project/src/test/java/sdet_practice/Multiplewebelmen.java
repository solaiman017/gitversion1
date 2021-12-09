package sdet_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewebelmen {

	public static void main(String[] args) {
	
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\md\\Desktop\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			
			// Xpath using or operator// any one off attribute should match either 1st or 2nd attribut.
			//driver.findElement(By.xpath("//input[@id='search_query_top'or @name='search_query']")).sendKeys("solaiman");
		//And operator both attribute should be match
			//driver.findElement(By.xpath("//input[@id='search_query_top'and @name='search_query']")).sendKeys("solaiman");
			// contains method//pertially matching the element insted of taking (search_query_top)it take only search.
			//driver.findElement(By.xpath("//input[(@id,'search')]")).sendKeys("solaiman");
			//start-with method
			//driver.findElement(By.xpath("//input[starts-with(@id,'search')]")).sendKeys("solaiman");
			//Xpath with text() function
			//driver.findElement(By.xpath("//a[text()='Women']")).click();
			//chaind Xpath
			//form[@id='searchbox']//input[4]// it goes parent to child element
			//driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("solaiman");
			//instead of index we can give attribitu value also
			//driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("solaiman");


			

	}

}

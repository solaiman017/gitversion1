package sdet_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video_7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\md\\Desktop\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("solaiman@gmail.com");
		
		WebElement emailinputbox=driver.findElement(By.xpath("//*[@id='Email']"));
				//sendKeys("solaiman@gmail.com");
		
		//System.out.println("result from get attribute"+  emailinputbox.getAttribute("value"));
		System.out.println("result from get attribute"+  emailinputbox.getText());
		//driver.findElement(By.xpath("//*[@id='Email']")).clear();

		//driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(Keys.F5);
		//driver.findElement(By.xpath("//*[@id='Password']")).clear();
		WebElement button=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
		
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("class"));
		String Title=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		driver.manage();
		System.out.println(driver.getCurrentUrl());
		//https://demo.nopcommerce.com/login?returnUrl=%2F
		
		System.out.println(Title);
	}

}

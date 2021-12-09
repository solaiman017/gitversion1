package sdet_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourth_video {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\md\\Desktop\\chromedriver.exe");

WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com/gmail/about/#");
driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/a/span[2]")).click();
		


	}

}

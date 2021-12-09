package sdet_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third_video {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\md\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://frontend.nopcommerce.com/");
		driver.getTitle();
		System.out.println("this the title of the page:"+driver.getTitle());
		driver.getCurrentUrl();
		System.out.println("this is the url of the page:+"+driver.getCurrentUrl());
		driver.getPageSource();
		System.out.println("this is the page source:"+driver.getPageSource());
	}

}

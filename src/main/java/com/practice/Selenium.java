package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); //driver path
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}

}

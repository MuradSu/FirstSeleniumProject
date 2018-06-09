package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {

		//// set ChromeDriver system properties
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Name\\Documents\\" + "Selenium dependencies\\drivers\\chromedriver.exe");

		//// create ChromeDriver driver object
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.aliexress.com/");
}
}
package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo {

	public static void main(String[] args) {

		//// set ChromeDriver system properties
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Name\\Documents\\" + "Selenium dependencies\\drivers\\chromedriver.exe");

		//// create ChromeDriver driver object
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.google.com/");

		//// set FirefoxDriver system properties
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Name\\Documents\\" + "Selenium dependencies\\drivers\\geckodriver.exe");

		// create FirefoxDriver object
		WebDriver driver2 = new FirefoxDriver();

		driver2.get("https://www.google.com/");

		// set Edge system properties
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Name\\Documents\\" + "Selenium dependencies\\drivers\\MicrosoftWebDriver.exe");

		// create Edge driver object
		WebDriver driver3 = new EdgeDriver();

		driver3.get("https://www.google.com/");

		// set InternetExplorer system properties
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Name\\Documents\\" + "Selenium dependencies\\drivers\\IEDriverServer.exe");

		// create Internet Explorer driver object
		WebDriver driver4 = new InternetExplorerDriver();

		driver4.get("https://www.google.com/");
	}
}

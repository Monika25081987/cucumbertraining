package com.TestRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;
	static Properties properties = new Properties();

	static {
		try(FileInputStream fis = new FileInputStream("src\\test\\resources\\config.properties")){
			properties.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before Hooks");
		System.out.println("Launching Browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(properties.getProperty("url"));
	}
	
	@After
	public void afterTest() {
		System.out.println("After Hooks");
		if(driver !=null) {
			driver.quit();
		}
	}

}

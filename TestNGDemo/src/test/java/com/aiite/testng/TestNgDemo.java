package com.aiite.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgDemo
	{
		static WebDriver driver;

		@BeforeClass
		public void browserSetip()
			{
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}

		@Test
		public void googleSearch()
			{
				try
					{
						driver.get("https://www.google.com/");
						Thread.sleep(4000);
						driver.findElement(By.xpath("//textarea[@title = 'Search']")).sendKeys("GitHub", Keys.ENTER);
						Thread.sleep(4000);
					}
				catch (Exception e)
					{
						// TODO: handle exception
					}
			}

		@AfterClass
		public void closeBrowser()
			{
				driver.quit();
			}
	}

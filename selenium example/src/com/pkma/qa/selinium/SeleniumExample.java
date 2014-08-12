//package com.pkma.qa.selinium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample {
	
	private WebDriver driver;
	  private String baseUrl;
	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    baseUrl = "https://www.google.co.in/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	  }

	  @Test
	  public void testSELENIUMeXAMPLE() throws Exception {
	    driver.get(baseUrl);
	    driver.findElement(By.id("gs_tti0")).click();
	    driver.findElement(By.id("gbqfq")).clear();
	    driver.findElement(By.id("gbqfq")).sendKeys("SELENIUM");
	    driver.findElement(By.id("gbqfb")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    
	}
	

}

//package com.pkma.qa.selinium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample {
		
 public static void main(String[] args){
           SeleniumExample example=new SeleniumExample();
           System.out.println("Hai i am going to start ");
           org.junit.runner.JUnitCore jcore=new org.junit.runner.JUnitCore();
           jcore.run(example.getClass()); 
           System.out.println("I am done ");

        }
	
	private WebDriver driver;
	  private String baseUrl;
	  @Before
	  public void setUp() throws Exception {
	  	System.out.println("Hai i am at start of setup  ");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    baseUrl = "https://www.google.co.in/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("Hai i am  at end of setup ");
	    
	  }

	  @Test
	  public void testSELENIUMeXAMPLE() throws Exception {
	  	System.out.println("Hai i am at start of test  ");
	    driver.get(baseUrl);
	    driver.findElement(By.id("gs_tti0")).click();
	    driver.findElement(By.id("gbqfq")).clear();
	    driver.findElement(By.id("gbqfq")).sendKeys("SELENIUM");
	    driver.findElement(By.id("gbqfb")).click();
	    System.out.println("Hai i am at end of test  ");
	  }

	  @After
	  public void tearDown() throws Exception {
	  	System.out.println("Hai i am at start of After method ");
	    driver.quit();
	    System.out.println("Hai i am at end of After method ");
	}
	

}

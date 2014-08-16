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
	   baseUrl = "http://prokarma.force.com/Indiajobs";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("Hai i am  at end of setup ");
	    
	  }

	  @Test
	  public void testSELENIUMeXAMPLE() throws Exception {
	  	System.out.println("Hai i am at start of test  ");
	    driver.get(baseUrl);
	    driver.findElement(By.name("j_id0:j_id1:atsForm:j_id38")).click();
	    driver.findElement(By.name("j_id0:j_id1:atsForm:j_id38")).clear();
	    driver.findElement(By.name("j_id0:j_id1:atsForm:j_id38")).sendKeys("java");
	    driver.findElement(By.name("j_id0:j_id1:atsForm:j_id45")).click();
            driver.getCurrentUrl();
	    System.out.println("Hai i am at end of test  ");
	  }

	  @After
	  public void tearDown() throws Exception {
	  	System.out.println("Hai i am at start of After method ");
	    driver.quit();
	    System.out.println("Hai i am at end of After method ");
	}
	

}

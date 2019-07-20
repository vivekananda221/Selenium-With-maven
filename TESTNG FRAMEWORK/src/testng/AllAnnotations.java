package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotations 
{
  @Test(groups="a")
  public void f0()
  {
	  Reporter.log("test executed");
  }
  @Test(groups="b")
  public void f01()
  {
	  Reporter.log("test executed1");
  }
  @Test(groups= {"a","b"})
  public void f02()
  {
	  Reporter.log("test executed2");
  }
  @Test(groups="c")
  public void f03()
  {
	  Reporter.log("test executed3");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	
  }

  @AfterMethod
  public void afterMethod()
  {
  }

  @BeforeClass
  public void beforeClass() 
  {
  }

  @AfterClass
  public void afterClass() 
  {
  }

  @BeforeTest
  public void beforeTest() 
  {
  }

  @AfterTest
  public void afterTest() 
  {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}

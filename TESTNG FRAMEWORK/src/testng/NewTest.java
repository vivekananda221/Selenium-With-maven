package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest 
{
	// It will execute depends on alphabetical order so we need execute an order so we use this priority concept
  @Test(priority=0,description="Method Login")
  public void f()
  {
	  Reporter.log("Executed");
	  Reporter.log("yes",true);
  }
  
  @Test(priority=1,description="message",dependsOnMethods="f") // This method depends on f method it will be executed when f is executed
  public void f1()
  {
	  Reporter.log("Executed");
	  Reporter.log("yes",true);
  }
  
  @Test(priority=2,enabled=false) // Its just like @Ignore method in junit
  public void f2()
  {
	  Reporter.log("Executed");
	  Reporter.log("yes",true);
  }
  
  @Test(priority=3,dependsOnMethods= {"f","f1","f2"})
  public void f3()
  {
	  Reporter.log("Executed");
	  Reporter.log("yes",true);
	  Assert.assertEquals("xxx","xxx");
	  Assert.assertTrue(true);
  }
  
}

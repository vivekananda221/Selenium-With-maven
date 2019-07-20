package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class NewTest1 
{
  @Test 
  @Parameter()
  public void f() 
  {
	  Reporter.log("Executable Method");
  }
  
  @Test
  public void f1() 
  {
	  Reporter.log("Executable Method");
  }
  
  @Test
  public void f2() 
  {
	  Reporter.log("Executable Method");
  }
  
  @Test
  public void f3() 
  {
	  Reporter.log("Executable Method");
  }
}

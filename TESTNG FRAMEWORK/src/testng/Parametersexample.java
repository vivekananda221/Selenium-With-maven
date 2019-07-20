package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersexample {
  @Test
  @Parameters("url")
  public void f(String url) 
  {
	  System.out.println("The url from the xml file is:"+url);
  }
}

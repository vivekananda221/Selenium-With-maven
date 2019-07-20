package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class cvfr 
{
	
	@Test(dataProvider="dp")
	public void data(int i, String j)
	{
		
	}
	
  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
}

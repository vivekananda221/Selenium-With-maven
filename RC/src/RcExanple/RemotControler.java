package RcExanple;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

@SuppressWarnings("deprecation")
public class RemotControler {

	public static void main(String[] args) 
	{
		Selenium rc = new DefaultSelenium("localhost",4444,"firefox","https://facebook.com");
		rc.start();
		rc.open("/");
		rc.windowMaximize();
		rc.type("locator","value");
		rc.select("locator","24");
		rc.click("u_0_x");

	}

}

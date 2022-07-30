package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	@Before(order=3) //execute the incremental order
	public void thirdBefore() {
     System.out.println("Before Order Hooks 3");
     loadUrl("https://www.zappos.com/");
	}
	@Before(order=1)
	public void firstBefore() {
	System.out.println("Before Order Hooks 1");	
	launchChrome();
	}
	@Before(order=2)
	public void secondBefore() {
	System.out.println("Before Order Hooks 2");
	winMax();
	}
			
	@After(order=3) //execute the decremental order
	public void thirdScenario(Scenario s) throws IOException {
    System.out.println("After Order Hooks 3");
    //above lines for multiple screenshot in JVM report if failed means use if condition
//    TakesScreenshot tk1=(TakesScreenshot)driver;
//	byte[] screen = tk1.getScreenshotAs(OutputType.BYTES);
//     s.embed(screen, "image/png");
 if (s.isFailed()) {
// //below lines for multiple screenshot in screenshots folder under target for failed case
////	String name = s.getName();
////	String fileName = name.replace(" ","_");
////	screenshot(fileName);
//    	//below lines for In report we are seeing the screenshots under targert->JVM report->cucumber report
   	TakesScreenshot tk1=(TakesScreenshot)driver;
   	byte[] screen = tk1.getScreenshotAs(OutputType.BYTES);
        s.embed(screen, "image/png");
    	    }
	}
    @After(order=1)
	public void firstAfter() throws IOException {
    System.out.println("After Order Hooks 1");
    tabClose();
	}
    @After(order=2)
	public void secondAfter() throws IOException {
    System.out.println("After Order Hooks 2");
    printDate();
}
}

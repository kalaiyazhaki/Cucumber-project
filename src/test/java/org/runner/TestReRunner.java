package org.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Rerun\\failed.txt",glue="org.stepdefinition",dryRun=false,monochrome=true,snippets=SnippetType.UNDERSCORE
,tags={"@Sanity"},plugin= {"pretty",
		"html:target\\Reports",
		"junit:target\\Reports\\output.xml",
		"json:target\\Reports\\zappos.json",
		"rerun:src\\test\\resources\\Rerun\\failed.txt"})//add this step
//copy and paste all the content from Runner class to TestReRunner class and add rerun in plugin

public class TestReRunner {
	
	@AfterClass
	public static void test() {
		//inside give json path in system.getproperty
    JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\zappos.json");
	}
}

package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String jsonPath) {
   //1.Mention the desired location of your jvm report
		File f=new File(System.getProperty("user.dir")+"\\target\\Reports\\JVMReport");
		
	//2.Add details to the report using configuration class	
		Configuration con=new Configuration(f, "ZAPPOS");
		con.addClassifications("Platform Name", "Windows 11"); //string name and string value
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "101");
		con.addClassifications("Sprint", "32.1.4");
		
	//3.convert string in to List<string>
		List<String> li=new ArrayList<String>();
		li.add(jsonPath);
		
	//4.create the object for report builder class
		ReportBuilder r=new ReportBuilder(li, con);
		r.generateReports();
		
}
}

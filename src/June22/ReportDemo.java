package June22;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportDemo {
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void setUp() {
		report=new ExtentReports("./Reports/Demo.html");
		report.loadConfig(new File("D:\\Selenium1\\Primus_Bank\\Extent.xml"));
		
	}
@Test
public void testPass() {
	test=report.startTest("Test Pass");
	test.assignAuthor("Pratap");
	test.log(LogStatus.PASS, "My Test Case Pass");
}
@Test
public void testfail() {
	test=report.startTest("Test fail");
	test.assignAuthor("Pratap");
	test.log(LogStatus.FAIL, "My Test Case fail");
}@Test
public void testSkip() {
	test=report.startTest("Test Skip");
	test.assignAuthor("Pratap");
	test.log(LogStatus.SKIP, "My Test Case Skip");
}
@AfterMethod
public void tearDown() {
	report.endTest(test);
	report.flush();
}
}

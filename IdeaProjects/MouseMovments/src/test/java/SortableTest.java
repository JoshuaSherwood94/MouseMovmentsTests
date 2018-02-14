import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SortableTest {

    private static ExtentReports report;
    private WebDriver webDriver;
    private static final String BASE_URL = "http://demoqa.com";

    @BeforeClass
    public static void init() {
        report = new ExtentReports();
        String fileName = "MyReport" + ".html";
        String filePath = System.getProperty("user.dir")
                + File.separatorChar + fileName;
        report.attachReporter(new ExtentHtmlReporter(filePath));
    }

    @Before
    public void DroppableTestSetUpP() {
        webDriver = new ChromeDriver();
        webDriver.navigate().to(BASE_URL);
    }

    @Test
    public void DroppableTestP() {
        DemoqaHome home = PageFactory.initElements(webDriver, DemoqaHome.class);
        SortablePage sort = PageFactory.initElements(webDriver, SortablePage.class);

        ExtentTest test = report.createTest("Droppable Test");
        test.log(Status.INFO, "Test is Starting ");
        home.sortable();
        test.log(Status.DEBUG, "Page Open");
        sort.move(webDriver);
        test.log(Status.DEBUG, "Dropping box");

        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tidyDroppableTestP() {
        webDriver.quit();
    }

    @AfterClass
    public static void cleanUp() {
        report.flush();
    }
}

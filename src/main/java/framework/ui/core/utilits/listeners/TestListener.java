package framework.ui.core.utilits.listeners;

import framework.ui.core.utilits.logging.screens.Screen;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestContext context = result.getTestContext();
        WebDriver driver = (WebDriver) context.getAttribute("driver");
        new Screen().saveFailureScreenShot(driver);

//        try {
//            takeScreenshot("picture1.jpg");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void onTestFailure(ITestResult result) {

        ITestContext context = result.getTestContext();
        WebDriver driver = (WebDriver) context.getAttribute("driver");
        saveFailureScreenShot(driver);
//        new Screen().saveFailureScreenShot(driver);
//        try {
//            takeScreenshot("picture2.jpg");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Attachment
    public byte[] saveFailureScreenShot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}

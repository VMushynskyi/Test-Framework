package framework.ui.core.utilits.logging.screens;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Screen {

//    @Attachment
//    public static byte[] takeScreenshot(String resourceName) throws IOException {
//        return Files.readAllBytes(Paths.get("src/main/resources", resourceName));
////        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//    }

    @Attachment
    public byte[] saveFailureScreenShot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

}

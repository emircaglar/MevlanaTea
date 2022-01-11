package utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Hooks {
     LocalTime startTime;
     LocalTime endTime;
     Duration duration;

    @Before
    public void before() {
        startTime = LocalTime.now();
        if (Drivers.threadLanguage.get()==null){
            Drivers.threadLanguage.set("DE");
        }
        Drivers.getDriver().manage().deleteAllCookies();
        Parent.urlgit(Drivers.threadLanguage.get());
    }

    @After
    public void after(Scenario scenario) {
        endTime = LocalTime.now();
        duration = Duration.between(startTime, endTime);
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Drivers.getDriver();
            File screenShot = takesScreenshot.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenShot,
                        new File("src/test/resources/screenShots/FailedScreenShots/" + scenario.getId() + endTime.format(DateTimeFormatter.ISO_DATE_TIME) + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ExcelUtils.logExcel("src/test/resources/logs/log.xlsx", scenario, startTime, endTime, duration, Drivers.threadBrowserName.get());
        Drivers.quitDriver();
    }
}

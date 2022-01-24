package utils;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Hooks {
    private LocalTime startTime;
    private LocalTime endTime;
    private Duration duration;

    @Before
    public void before() {
        startTime = LocalTime.now();
        if (Drivers.threadLanguage.get() == null) {
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
        ExcelUtils.logScenarioToExcel(scenario, startTime, endTime, duration, Drivers.threadBrowserName.get());
        Drivers.quitDriver();
    }
}

package com.demoqa.utilities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected Actions actions;
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("demoqa_url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        actions = new Actions(Driver.getDriver());
    }
    //@AfterMethod
    public void tearDown(){
        Driver.getDriver().close();
    }
}
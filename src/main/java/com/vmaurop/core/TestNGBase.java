package com.vmaurop.core;

import com.codeborne.selenide.Selenide;
import com.vmaurop.api.APICalls;
import com.vmaurop.configuration.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@ContextConfiguration(classes = SpringConfig.class)
public class TestNGBase extends AbstractTestNGSpringContextTests {


    @Autowired
    APICalls APICalls;


    @BeforeClass(alwaysRun = true)
    @Parameters(value = {"browser", "baseUrl"})
    public synchronized void setupTest(@Optional String browser, String baseUrl) {
        DriverFactory.init(browser);
        Selenide.open(baseUrl);
    }

    @AfterClass(alwaysRun = true)
    public synchronized void tearDown() {
        Selenide.closeWebDriver();
    }
}

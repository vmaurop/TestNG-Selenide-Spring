package com.vmaurop.core;

import com.codeborne.selenide.Configuration;

public final class DriverFactory {

    private DriverFactory() {
        throw new IllegalStateException("Driver Factory class");
    }


    public static synchronized void init(String browser) {
        Configuration.browser = browser;
        Configuration.startMaximized = true;
        Configuration.driverManagerEnabled = true;
    }
}

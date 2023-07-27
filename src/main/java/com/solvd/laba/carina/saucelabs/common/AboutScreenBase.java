package com.solvd.laba.carina.saucelabs.common;

import org.openqa.selenium.WebDriver;

public abstract class AboutScreenBase extends AbstractSauceLabsScreenBase {

    public AboutScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isScreenUrlDisplayed();

}

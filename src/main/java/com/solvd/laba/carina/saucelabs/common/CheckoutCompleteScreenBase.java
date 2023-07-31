package com.solvd.laba.carina.saucelabs.common;

import org.openqa.selenium.WebDriver;

public abstract class CheckoutCompleteScreenBase extends AbstractSauceLabsScreenBase {

    public CheckoutCompleteScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isSuccessMessageDisplayed();

}

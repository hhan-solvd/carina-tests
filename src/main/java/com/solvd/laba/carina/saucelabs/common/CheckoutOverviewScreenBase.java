package com.solvd.laba.carina.saucelabs.common;

import org.openqa.selenium.WebDriver;

public abstract class CheckoutOverviewScreenBase extends AbstractSauceLabsScreenBase {

    public CheckoutOverviewScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract CheckoutCompleteScreenBase clickFinishButton();

}

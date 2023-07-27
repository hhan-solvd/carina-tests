package com.solvd.laba.carina.saucelabs.common;

import org.openqa.selenium.WebDriver;

public abstract class CheckoutInformationScreenBase extends AbstractSauceLabsScreenBase {

    public CheckoutInformationScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeFirstName(String firstName);

    public abstract void typeLastName(String lastName);

    public abstract void typeZipcode(String zipCode);

    public abstract CheckoutOverviewScreenBase clickContinueButton();

}

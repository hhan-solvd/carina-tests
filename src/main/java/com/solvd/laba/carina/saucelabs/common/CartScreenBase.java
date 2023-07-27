package com.solvd.laba.carina.saucelabs.common;

import org.openqa.selenium.WebDriver;

public abstract class CartScreenBase extends AbstractSauceLabsScreenBase {

    public CartScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPresent(String productTitle);

    public abstract CheckoutInformationScreenBase clickCheckoutButton();

    public abstract void clickRemoveButton();

}

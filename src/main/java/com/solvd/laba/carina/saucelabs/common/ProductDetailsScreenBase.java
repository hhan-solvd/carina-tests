package com.solvd.laba.carina.saucelabs.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductDetailsScreenBase extends AbstractSauceLabsScreenBase {

    public ProductDetailsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddToCartButton();

    public abstract CartScreenBase clickCartButton();

}

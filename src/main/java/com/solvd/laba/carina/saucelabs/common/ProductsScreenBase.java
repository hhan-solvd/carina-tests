package com.solvd.laba.carina.saucelabs.common;

import com.solvd.laba.carina.saucelabs.common.components.NavigationMenuBase;
import org.openqa.selenium.WebDriver;

public abstract class ProductsScreenBase extends AbstractSauceLabsScreenBase {

    public ProductsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract ProductDetailsScreenBase clickProductTitle(String productTitle);

    public abstract NavigationMenuBase clickNavigationButton();

}

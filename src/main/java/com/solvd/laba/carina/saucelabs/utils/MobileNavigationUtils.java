package com.solvd.laba.carina.saucelabs.utils;

import com.solvd.laba.carina.saucelabs.common.CartScreenBase;
import com.solvd.laba.carina.saucelabs.common.ProductDetailsScreenBase;
import com.solvd.laba.carina.saucelabs.common.ProductsScreenBase;
import com.solvd.laba.carina.saucelabs.common.components.NavigationMenuBase;

public class MobileNavigationUtils {

    private LoginUtils loginUtils;

    public MobileNavigationUtils() {
        this.loginUtils = new LoginUtils();
    }

    public ProductsScreenBase openProductScreen() {
        return loginUtils.loginUser();
    }

    public ProductDetailsScreenBase openProductDetailsScreen(String productTitle) {
        return openProductScreen().clickProductTitle(productTitle);
    }

    public CartScreenBase openCartScreenWithProductAdded(String productTitle) {
        ProductDetailsScreenBase productDetailsScreen = openProductDetailsScreen(productTitle);
        productDetailsScreen.clickAddToCartButton();
        return productDetailsScreen.clickCartButton();
    }

    public NavigationMenuBase openNavigationMenu() {
        return openProductScreen().clickNavigationButton();
    }

}
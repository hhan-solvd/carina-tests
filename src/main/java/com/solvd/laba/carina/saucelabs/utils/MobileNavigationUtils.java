package com.solvd.laba.carina.saucelabs.utils;

import com.solvd.laba.carina.saucelabs.android.CartScreen;
import com.solvd.laba.carina.saucelabs.android.ProductDetailsScreen;
import com.solvd.laba.carina.saucelabs.android.ProductsScreen;
import com.solvd.laba.carina.saucelabs.android.components.NavigationMenu;

public class MobileNavigationUtils {

    private LoginUtils loginUtils;

    public MobileNavigationUtils() {
        this.loginUtils = new LoginUtils();
    }

    public ProductsScreen openProductScreen() {
        return loginUtils.loginUser();
    }

    public ProductDetailsScreen openProductDetailsScreen(String productTitle) {
        return (ProductDetailsScreen) openProductScreen().clickProductTitle(productTitle);
    }

    public CartScreen openCartScreenWithProductAdded(String productTitle) {
        ProductDetailsScreen productDetailsScreen = openProductDetailsScreen(productTitle);
        productDetailsScreen.clickAddToCartButton();
        return (CartScreen) productDetailsScreen.clickCartButton();
    }

    public NavigationMenu openNavigationMenu() {
        return (NavigationMenu) openProductScreen().clickNavigationButton();
    }

}
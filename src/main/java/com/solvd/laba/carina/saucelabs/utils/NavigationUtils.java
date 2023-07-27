package com.solvd.laba.carina.saucelabs.utils;

import com.solvd.laba.carina.saucelabs.android.CartScreen;
import com.solvd.laba.carina.saucelabs.android.ProductDetailsScreen;
import com.solvd.laba.carina.saucelabs.common.LoginScreenBase;
import com.solvd.laba.carina.saucelabs.android.ProductsScreen;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;

public class NavigationUtils implements IAbstractTest {

    public ProductsScreen openProductScreen() {
        String username = R.TESTDATA.get("username");
        String password = R.TESTDATA.get("mobilePassword");

        LoginScreenBase loginScreen = initPage(LoginScreenBase.class);
        loginScreen.typeUsername(username);
        loginScreen.typePassword(password);

        return (ProductsScreen) loginScreen.clickLoginButton();
    }

    public ProductDetailsScreen openProductDetailsScreen(String productTitle) {
        return (ProductDetailsScreen) openProductScreen().clickProductTitle(productTitle);
    }

    public CartScreen openCartScreenWithProductAdded(String productTitle) {
        ProductDetailsScreen productDetailsScreen = openProductDetailsScreen(productTitle);
        productDetailsScreen.clickAddToCartButton();
        return (CartScreen) productDetailsScreen.clickCartButton();
    }

}


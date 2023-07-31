package com.solvd.laba.carina.mobiletests;

import com.solvd.laba.carina.saucelabs.common.*;
import com.solvd.laba.carina.saucelabs.common.components.NavigationMenuBase;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceLabsTest extends AbstractSauceLabsTest {

    @Test()
    @MethodOwner(owner = "hhan")
    public void testLoginUser() {
        String username = R.TESTDATA.get("username");
        String password = R.TESTDATA.get("mobilePassword");

        LoginScreenBase loginScreen = initPage(LoginScreenBase.class);
        Assert.assertTrue(loginScreen.isOpened(), "Login screen is not opened");
        loginScreen.typeUsername(username);
        loginScreen.typePassword(password);
        ProductsScreenBase productsScreen = loginScreen.clickLoginButton();
        Assert.assertTrue(productsScreen.isOpened(), "Products screen is not opened");
    }

    @Test()
    @MethodOwner(owner = "hhan")
    public void testAddToCart() {
        String productTitle = R.TESTDATA.get("productTitle");

        ProductDetailsScreenBase productDetailsScreen = mobileNavigationUtils.openProductDetailsScreen(productTitle);
        productDetailsScreen.clickAddToCartButton();
        CartScreenBase cartScreen = productDetailsScreen.clickCartButton();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        Assert.assertTrue(cartScreen.isProductPresent(productTitle), "Product is not added to the cart");
    }

    @Test()
    @MethodOwner(owner = "hhan")
    public void testLogoutUser() {
        NavigationMenuBase navigationMenu = mobileNavigationUtils.openNavigationMenu();
        LoginScreenBase loginScreen = navigationMenu.clickLogoutButton();
        Assert.assertTrue(loginScreen.isOpened(), "Login screen is not opened after clicking on logout button");
    }

    @Test()
    @MethodOwner(owner = "hhan")
    public void testCheckoutUser() {
        String productTitle = R.TESTDATA.get("productTitle");
        String firstName = R.TESTDATA.get("firstName");
        String lastName = R.TESTDATA.get("lastName");
        String zipcode = R.TESTDATA.get("zipcode");

        CartScreenBase cartScreen = mobileNavigationUtils.openCartScreenWithProductAdded(productTitle);
        CheckoutInformationScreenBase checkoutInformationScreen = cartScreen.clickCheckoutButton();
        Assert.assertTrue(checkoutInformationScreen.isOpened(), "Checkout information screen is not opened");
        checkoutInformationScreen.typeFirstName(firstName);
        checkoutInformationScreen.typeLastName(lastName);
        checkoutInformationScreen.typeZipcode(zipcode);

        CheckoutOverviewScreenBase checkoutOverviewScreen = checkoutInformationScreen.clickContinueButton();
        Assert.assertTrue(checkoutOverviewScreen.isOpened(), "Checkout overview screen is not opened");
        CheckoutCompleteScreenBase checkoutCompleteScreen = checkoutOverviewScreen.clickFinishButton();
        Assert.assertTrue(checkoutCompleteScreen.isOpened(), "Checkout complete screen is not opened");
        Assert.assertTrue(checkoutCompleteScreen.isSuccessMessageDisplayed(), "Checkout success message is not displayed");
    }

    @Test()
    @MethodOwner(owner = "hhan")
    public void testAboutNavigation() {
        NavigationMenuBase navigationMenu = mobileNavigationUtils.openNavigationMenu();
        AboutScreenBase aboutScreen = navigationMenu.clickAboutButton();
        Assert.assertTrue(aboutScreen.isOpened(), "About screen is not opened");
        Assert.assertTrue(aboutScreen.isScreenUrlDisplayed(), "About screen url is not displayed");
    }

}

package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.CartScreenBase;
import com.solvd.laba.carina.saucelabs.common.CheckoutInformationScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Labs Backpack\"`]")
    private ExtendedWebElement screenTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Description\"`]/XCUIElementTypeStaticText[`label == \"%s\"`]")
    private ExtendedWebElement productTitleS;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"CHECKOUT\" AND name == \"CHECKOUT\"`]")
    private ExtendedWebElement checkoutButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-REMOVE\"`]")
    private ExtendedWebElement removeButton;

    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return screenTitle.isElementPresent();
    }

    @Override
    public boolean isProductPresent(String productTitle) {
        return swipe(productTitleS.format(productTitle), 5);
    }

    @Override
    public CheckoutInformationScreenBase clickCheckoutButton() {
        swipe(checkoutButton, 1);
        checkoutButton.click();
        return initPage(CheckoutInformationScreenBase.class);
    }

    @Override
    public void clickRemoveButton() {
        removeButton.click();
    }

}

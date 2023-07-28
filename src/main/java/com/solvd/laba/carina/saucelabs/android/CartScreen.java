package com.solvd.laba.carina.saucelabs.android;

import com.solvd.laba.carina.saucelabs.common.CartScreenBase;
import com.solvd.laba.carina.saucelabs.common.CheckoutInformationScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"YOUR CART\"]")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[@text='%s']")
    private ExtendedWebElement productTitleS;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]")
    private ExtendedWebElement checkoutButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]")
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
        return swipe(productTitleS.format(productTitle));
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

package com.solvd.laba.carina.saucelabs.android;

import com.solvd.laba.carina.saucelabs.common.CartScreenBase;
import com.solvd.laba.carina.saucelabs.common.ProductDetailsScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = ProductDetailsScreenBase.class)
public class ProductDetailsScreen extends ProductDetailsScreenBase implements IMobileUtils {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]")
    private ExtendedWebElement addToCartButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]")
    private ExtendedWebElement cartButton;

    public ProductDetailsScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickAddToCartButton() {
        swipe(addToCartButton, 1);
        addToCartButton.click();
    }

    @Override
    public CartScreenBase clickCartButton() {
        cartButton.click();
        return initPage(CartScreenBase.class);
    }

}

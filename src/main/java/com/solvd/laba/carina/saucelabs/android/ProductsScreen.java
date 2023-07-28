package com.solvd.laba.carina.saucelabs.android;

import com.solvd.laba.carina.saucelabs.common.ProductDetailsScreenBase;
import com.solvd.laba.carina.saucelabs.common.ProductsScreenBase;
import com.solvd.laba.carina.saucelabs.common.components.NavigationMenuBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = ProductsScreenBase.class)
public class ProductsScreen extends ProductsScreenBase {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart drop zone']//android.widget.TextView[@text=\"PRODUCTS\"]")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"test-Item title\"][@text='%s']")
    private ExtendedWebElement productTitleS;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup")
    private ExtendedWebElement navigationButton;

    public ProductsScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return screenTitle.isElementPresent();
    }

    @Override
    public ProductDetailsScreenBase clickProductTitle(String productTitle) {
        productTitleS = productTitleS.format(productTitle);
        swipe(productTitleS, 5);
        productTitleS.click();
        return initPage(ProductDetailsScreenBase.class);
    }

    @Override
    public NavigationMenuBase clickNavigationButton() {
        navigationButton.click();
        return initPage(NavigationMenuBase.class);
    }

}

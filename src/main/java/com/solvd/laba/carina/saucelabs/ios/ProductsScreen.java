package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.ProductDetailsScreenBase;
import com.solvd.laba.carina.saucelabs.common.ProductsScreenBase;
import com.solvd.laba.carina.saucelabs.common.components.NavigationMenuBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = ProductsScreenBase.class)
public class ProductsScreen extends ProductsScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"PRODUCTS\"`]")
    private ExtendedWebElement screenTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"%s\"`]")
    private ExtendedWebElement productTitleS;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Menu\"`]")
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

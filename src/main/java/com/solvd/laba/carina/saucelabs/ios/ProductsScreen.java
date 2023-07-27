package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.ProductDetailsScreenBase;
import com.solvd.laba.carina.saucelabs.common.ProductsScreenBase;
import com.solvd.laba.carina.saucelabs.common.components.NavigationMenuBase;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = ProductsScreenBase.class)
public class ProductsScreen extends ProductsScreenBase {

    public ProductsScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductDetailsScreenBase clickProductTitle(String productTitle) {
        throw new NotSupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public NavigationMenuBase clickNavigationButton() {
        throw new NotSupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_IOS);
    }

}

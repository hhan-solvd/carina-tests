package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.CartScreenBase;
import com.solvd.laba.carina.saucelabs.common.ProductDetailsScreenBase;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = ProductDetailsScreenBase.class)
public class ProductDetailsScreen extends ProductDetailsScreenBase {

    public ProductDetailsScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickAddToCartButton() {
        throw new NotSupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

    @Override
    public CartScreenBase clickCartButton() {
        throw new NotSupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

}

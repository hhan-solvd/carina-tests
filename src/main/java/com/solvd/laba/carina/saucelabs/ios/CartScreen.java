package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.CartScreenBase;
import com.solvd.laba.carina.saucelabs.common.CheckoutInformationScreenBase;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase {

    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPresent(String productTitle) {
        throw new NotSupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

    @Override
    public CheckoutInformationScreenBase clickCheckoutButton() {
        throw new NotSupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

    @Override
    public void clickRemoveButton() {
        throw new NotSupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

}

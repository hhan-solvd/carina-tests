package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.CheckoutCompleteScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = CheckoutCompleteScreenBase.class)
public class CheckoutCompleteScreen extends CheckoutCompleteScreenBase implements IMobileUtils {

    public CheckoutCompleteScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

    @Override
    public boolean isSuccessMessageDisplayed() {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

}

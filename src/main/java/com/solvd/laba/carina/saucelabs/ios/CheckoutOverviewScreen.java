package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.CheckoutCompleteScreenBase;
import com.solvd.laba.carina.saucelabs.common.CheckoutOverviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = CheckoutOverviewScreenBase.class)
public class CheckoutOverviewScreen extends CheckoutOverviewScreenBase implements IMobileUtils {

    public CheckoutOverviewScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public CheckoutCompleteScreenBase clickFinishButton() {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

}

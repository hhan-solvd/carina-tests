package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.AboutScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = AboutScreenBase.class)
public class AboutScreen extends AboutScreenBase {

    public AboutScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public boolean isScreenUrlDisplayed() {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_IOS);
    }

}

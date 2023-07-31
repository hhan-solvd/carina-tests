package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.CheckoutInformationScreenBase;
import com.solvd.laba.carina.saucelabs.common.CheckoutOverviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = CheckoutInformationScreenBase.class)
public class CheckoutInformationScreen extends CheckoutInformationScreenBase {

    public CheckoutInformationScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public void typeFirstName(String firstName) {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public void typeLastName(String lastName) {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public void typeZipcode(String zipcode) {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public CheckoutOverviewScreenBase clickContinueButton() {
        throw new UnsupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_IOS);
    }

}

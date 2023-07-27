package com.solvd.laba.carina.saucelabs.ios.components;

import com.solvd.laba.carina.saucelabs.common.AboutScreenBase;
import com.solvd.laba.carina.saucelabs.common.LoginScreenBase;
import com.solvd.laba.carina.saucelabs.common.components.NavigationMenuBase;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = NavigationMenuBase.class)
public class NavigationMenu extends NavigationMenuBase implements IMobileUtils {
    public NavigationMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginScreenBase clickLogoutButton() {
        throw new NotSupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

    @Override
    public AboutScreenBase clickAboutButton() {
        throw new NotSupportedOperationException(METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS);
    }

}

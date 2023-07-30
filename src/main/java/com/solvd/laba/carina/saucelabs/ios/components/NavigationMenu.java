package com.solvd.laba.carina.saucelabs.ios.components;

import com.solvd.laba.carina.saucelabs.common.AboutScreenBase;
import com.solvd.laba.carina.saucelabs.common.LoginScreenBase;
import com.solvd.laba.carina.saucelabs.common.components.NavigationMenuBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = NavigationMenuBase.class)
public class NavigationMenu extends NavigationMenuBase {

    @ExtendedFindBy(accessibilityId = "test-LOGOUT")
    private ExtendedWebElement logoutButton;

    @ExtendedFindBy(accessibilityId = "test-ABOUT")
    private ExtendedWebElement aboutButton;

    public NavigationMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginScreenBase clickLogoutButton() {
        logoutButton.click();
        return initPage(LoginScreenBase.class);
    }

    public AboutScreenBase clickAboutButton() {
        aboutButton.click();
        return initPage(AboutScreenBase.class);
    }

}

package com.solvd.laba.carina.saucelabs.android.components;

import com.solvd.laba.carina.saucelabs.common.AboutScreenBase;
import com.solvd.laba.carina.saucelabs.common.LoginScreenBase;
import com.solvd.laba.carina.saucelabs.common.components.NavigationMenuBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = NavigationMenuBase.class)
public class NavigationMenu extends NavigationMenuBase implements IMobileUtils {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGOUT']")
    private ExtendedWebElement logoutButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-ABOUT']")
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

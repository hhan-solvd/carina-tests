package com.solvd.laba.carina.saucelabs.android;

import com.solvd.laba.carina.saucelabs.common.AboutScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = AboutScreenBase.class)
public class AboutScreen extends AboutScreenBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.EditText[@text='saucelabs.com']")
    private ExtendedWebElement screenUrl;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Saucelabs\"]")
    private ExtendedWebElement screenTitle;

    public AboutScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return screenTitle.isElementPresent();
    }

    @Override
    public boolean isScreenUrlDisplayed() {
        return screenUrl.isElementPresent();
    }

}

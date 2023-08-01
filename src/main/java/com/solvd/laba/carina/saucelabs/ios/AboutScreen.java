package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.AboutScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = AboutScreenBase.class)
public class AboutScreen extends AboutScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`label == \"Address\"`]")
    private ExtendedWebElement screenUrl;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeImage[`label == \"Saucelabs\"`]")
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

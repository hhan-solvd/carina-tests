package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.CheckoutCompleteScreenBase;
import com.solvd.laba.carina.saucelabs.common.CheckoutOverviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = CheckoutOverviewScreenBase.class)
public class CheckoutOverviewScreen extends CheckoutOverviewScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"CHECKOUT: OVERVIEW\"`]")
    private ExtendedWebElement screenTitle;

    @ExtendedFindBy(accessibilityId = "test-FINISH")
    private ExtendedWebElement finishButton;

    public CheckoutOverviewScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return screenTitle.isElementPresent();
    }

    @Override
    public CheckoutCompleteScreenBase clickFinishButton() {
        swipe(finishButton, 1);
        finishButton.click();
        return initPage(CheckoutCompleteScreenBase.class);
    }

}

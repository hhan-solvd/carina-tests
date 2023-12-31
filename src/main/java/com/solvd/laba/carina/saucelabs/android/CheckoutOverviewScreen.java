package com.solvd.laba.carina.saucelabs.android;

import com.solvd.laba.carina.saucelabs.common.CheckoutCompleteScreenBase;
import com.solvd.laba.carina.saucelabs.common.CheckoutOverviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = CheckoutOverviewScreenBase.class)
public class CheckoutOverviewScreen extends CheckoutOverviewScreenBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"CHECKOUT: OVERVIEW\"]")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-FINISH\"]")
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

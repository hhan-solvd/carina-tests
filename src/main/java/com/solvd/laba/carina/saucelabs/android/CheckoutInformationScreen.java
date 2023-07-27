package com.solvd.laba.carina.saucelabs.android;

import com.solvd.laba.carina.saucelabs.common.CheckoutInformationScreenBase;
import com.solvd.laba.carina.saucelabs.common.CheckoutOverviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = CheckoutInformationScreenBase.class)
public class CheckoutInformationScreen extends CheckoutInformationScreenBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.TextView[@text=\"CHECKOUT: INFORMATION\"]")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-First Name\"]")
    private ExtendedWebElement firstNameField;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Last Name\"]")
    private ExtendedWebElement lastNameField;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")
    private ExtendedWebElement zipCodeField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]")
    private ExtendedWebElement continueButton;

    public CheckoutInformationScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return screenTitle.isElementPresent();
    }

    @Override
    public void typeFirstName(String firstName) {
        firstNameField.type(firstName);
    }

    @Override
    public void typeLastName(String lastName) {
        lastNameField.type(lastName);
    }

    @Override
    public void typeZipcode(String zipcode) {
        zipCodeField.type(zipcode);
    }

    @Override
    public CheckoutOverviewScreenBase clickContinueButton() {
        continueButton.click();
        return initPage(CheckoutOverviewScreenBase.class);
    }

}

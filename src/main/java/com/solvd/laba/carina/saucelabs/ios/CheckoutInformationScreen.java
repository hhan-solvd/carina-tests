package com.solvd.laba.carina.saucelabs.ios;

import com.solvd.laba.carina.saucelabs.common.CheckoutInformationScreenBase;
import com.solvd.laba.carina.saucelabs.common.CheckoutOverviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = Type.IOS_PHONE, parentClass = CheckoutInformationScreenBase.class)
public class CheckoutInformationScreen extends CheckoutInformationScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"CHECKOUT: INFORMATION\"`]")
    private ExtendedWebElement screenTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-First Name\"`]")
    private ExtendedWebElement firstNameField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-Last Name\"`]")
    private ExtendedWebElement lastNameField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-Zip/Postal Code\"`]")
    private ExtendedWebElement zipCodeField;

    @ExtendedFindBy(accessibilityId = "test-CONTINUE")
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
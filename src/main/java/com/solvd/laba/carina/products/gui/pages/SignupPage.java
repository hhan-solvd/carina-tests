package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class SignupPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='name']")
    private ExtendedWebElement nameField;

    @FindBy(xpath = "//input[@id='email']")
    private ExtendedWebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//input[@id='first_name']")
    private ExtendedWebElement firstNameField;

    @FindBy(xpath = "//input[@id='last_name']")
    private ExtendedWebElement lastNameField;

    @FindBy(xpath = "//input[@id='address1']")
    private ExtendedWebElement addressField;

    @FindBy(xpath = "//input[@id='state']")
    private ExtendedWebElement stateField;

    @FindBy(xpath = "//input[@id='city']")
    private ExtendedWebElement cityField;

    @FindBy(xpath = "//input[@id='zipcode']")
    private ExtendedWebElement zipcodeField;

    @FindBy(xpath = "//input[@id='mobile_number']")
    private ExtendedWebElement mobileNumberField;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    private ExtendedWebElement createAccountButton;

    public SignupPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(createAccountButton);
    }

    public void typeName(String name) {
        nameField.type(name);
    }

    public void typeEmail(String email) {
        emailField.type(email);
    }

    public void typePassword(String password) {
        passwordField.type(password);
    }

    public void typeFirstName(String firstName) {
        firstNameField.type(firstName);
    }

    public void typeLastName(String lastName) {
        lastNameField.type(lastName);
    }

    public void typeAddress(String address) {
        addressField.type(address);
    }

    public void typeState(String state) {
        stateField.type(state);
    }

    public void typeCity(String city) {
        cityField.type(city);
    }

    public void typeZipcode(String zipcode) {
        zipcodeField.type(zipcode);
    }

    public void typeMobileNumber(String mobileNumber) {
        mobileNumberField.type(mobileNumber);
    }

    public boolean isCreateAccountButtonDisplayed() {
        return createAccountButton.isElementPresent();
    }

    public AccountCreatedPage clickCreateAccountButton() {
        createAccountButton.click();
        return new AccountCreatedPage(driver);
    }

}

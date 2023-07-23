package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class SignupLoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private ExtendedWebElement nameField;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private ExtendedWebElement signupEmailField;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private ExtendedWebElement signupButton;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private ExtendedWebElement loginEmailField;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private ExtendedWebElement loginButton;


    public SignupLoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(signupButton);
    }

    public void typeName(String name) {
        nameField.type(name);
    }

    public void typeSignupEmail(String email) {
        signupEmailField.type(email);
    }

    public void typeLoginEmail(String email) {
        loginEmailField.type(email);
    }

    public void typePassword(String password) {
        passwordField.type(password);
    }

    public SignupPage clickSignupButton() {
        signupButton.click();

        return new SignupPage(driver);
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage(driver);
    }

}

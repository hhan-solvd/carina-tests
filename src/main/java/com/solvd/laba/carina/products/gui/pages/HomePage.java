package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/login']")
    private ExtendedWebElement signupLoginButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/contact_us']")
    private ExtendedWebElement contactUsButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/products']")
    private ExtendedWebElement productsButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/view_cart']")
    private ExtendedWebElement cartButton;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private ExtendedWebElement subscribeEmailField;

    @FindBy(xpath = "//button[@id='subscribe']")
    private ExtendedWebElement subscribeButton;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private ExtendedWebElement successSubscribeMessage;


    public HomePage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setPageAbsoluteURL(R.CONFIG.get("url"));
    }

    public SignupLoginPage clickSignupLoginButton() {
        signupLoginButton.click();

        return new SignupLoginPage(driver);
    }

    public ProductsPage clickProductsButton() {
        productsButton.click();

        return new ProductsPage(driver);
    }

    public CartPage clickCartButton() {
        cartButton.click();

        return new CartPage(driver);
    }

    public void typeSubscribeEmail(String email) {
        subscribeEmailField.type(email);
    }

    public void clickSubscribeButton() {
        subscribeButton.click();
    }

    public boolean isSuccessSubscribeMessageDisplayed() {
        return successSubscribeMessage.isElementPresent();
    }

}

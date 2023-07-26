package com.solvd.laba.carina.products.gui.pages.components;

import com.solvd.laba.carina.products.gui.pages.CartPage;
import com.solvd.laba.carina.products.gui.pages.ProductsPage;
import com.solvd.laba.carina.products.gui.pages.SignupLoginPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractUIObject {

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/login']")
    private ExtendedWebElement signupLoginButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/products']")
    private ExtendedWebElement productsButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/view_cart']")
    private ExtendedWebElement cartButton;

    public NavigationBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
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

}
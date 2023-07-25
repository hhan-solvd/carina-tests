package com.solvd.laba.carina.products.gui.pages.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

public class SubscriptionComponent extends AbstractUIObject {

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private ExtendedWebElement subscribeEmailField;

    @FindBy(xpath = "//button[@id='subscribe']")
    private ExtendedWebElement subscribeButton;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private ExtendedWebElement successSubscribeMessage;

    public SubscriptionComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
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
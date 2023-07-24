package com.solvd.laba.carina.products.gui.pages;

import com.solvd.laba.carina.products.gui.pages.components.NavigationBar;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    private NavigationBar navigationBar;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private ExtendedWebElement subscribeEmailField;

    @FindBy(xpath = "//button[@id='subscribe']")
    private ExtendedWebElement subscribeButton;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private ExtendedWebElement successSubscribeMessage;


    public HomePage(WebDriver driver) {
        super(driver);
        this.navigationBar = new NavigationBar(driver, driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setPageAbsoluteURL(R.CONFIG.get("url"));
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
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

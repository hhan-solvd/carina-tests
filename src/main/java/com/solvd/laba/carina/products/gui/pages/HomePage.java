package com.solvd.laba.carina.products.gui.pages;

import com.solvd.laba.carina.products.gui.pages.components.NavigationBar;
import com.solvd.laba.carina.products.gui.pages.components.SubscriptionComponent;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='shop-menu pull-right']/ul")
    private NavigationBar navigationBar;

    @FindBy(xpath = "//footer[@id='footer']//div[@class='single-widget']")
    private SubscriptionComponent subscriptionComponent;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setPageAbsoluteURL(R.CONFIG.get("url"));
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public SubscriptionComponent getSubscriptionComponent() {
        return subscriptionComponent;
    }

}

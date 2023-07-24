package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {

    @FindBy(xpath = "//a[@href='/product_details/%s']")
    private ExtendedWebElement product;

    public CartPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public boolean isProductDisplayed(String productId) {
        return product.format(productId).isElementPresent();
    }

}
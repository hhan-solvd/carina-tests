package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends AbstractPage {

    private ExtendedWebElement product;

    public CartPage(WebDriver driver, String productId) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        this.product = findExtendedWebElement(By.xpath(String.format("//a[@href='/product_details/%s']", productId)));
        setUiLoadedMarker(this.product);
    }

    public boolean isProductDisplayed() {
        return product.isElementPresent();
    }

}

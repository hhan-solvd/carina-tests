package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends AbstractPage {

    @FindBy(xpath = "//h2[contains(.,'All Products')]")
    private ExtendedWebElement allProductsTitle;

    @FindBy(xpath = "//*[@id='search_product']")
    private ExtendedWebElement searchProductField;

    @FindBy(xpath = "//*[@id='submit_search']")
    private ExtendedWebElement submitSearchButton;

    @FindBy(xpath = "//button[contains(@class, 'btn-success') and text()='Continue Shopping']")
    private ExtendedWebElement continueShoppingButton;

    @FindBy(xpath = "//a[@href='/product_details/%s']")
    private ExtendedWebElement productButtonById;

    @FindBy(xpath = "//a[@data-product-id='%s' and contains(@class, 'add-to-cart')]")
    private ExtendedWebElement addToCartButtonByProductId;

    public ProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(allProductsTitle);
    }

    public ProductDetailPage clickViewProductButtonByProductId(String productId) {
        productButtonById.format(productId).click();
        return new ProductDetailPage(driver);
    }

    public void typeProductName(String productName) {
        searchProductField.type(productName);
    }

    public SearchedProductsPage clickSubmitSearchButton() {
        submitSearchButton.click();
        return new SearchedProductsPage(driver);
    }

    public void clickAddToCartButtonByProductId(String productId) {
        addToCartButtonByProductId.format(productId).click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }

}


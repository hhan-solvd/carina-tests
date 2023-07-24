package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
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

    public ProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(allProductsTitle);
    }

    private ExtendedWebElement getProductButtonById(String productId) {
        String xpath = String.format("//a[@href='/product_details/%s']", productId);
        return findExtendedWebElement(By.xpath(xpath));
    }

    private ExtendedWebElement getAddToCartButtonByProductId(String productId) {
        String xpath = String.format("//a[@data-product-id='%s' and contains(@class, 'add-to-cart')]", productId);
        return findExtendedWebElement(By.xpath(xpath));
    }

    public ProductDetailPage clickViewProductButtonByProductId(String productId) {
        ExtendedWebElement productButton = getProductButtonById(productId);
        productButton.click();
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
        ExtendedWebElement addToCartButton = getAddToCartButtonByProductId(productId);
        addToCartButton.click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }

}

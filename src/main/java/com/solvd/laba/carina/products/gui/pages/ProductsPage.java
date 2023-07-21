package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class ProductsPage extends AbstractPage {

    @FindBy(xpath = "//h2[contains(.,'All Products')]")
    private ExtendedWebElement allProductsTitle;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    private ExtendedWebElement viewProductButtonOfFirstProduct;

    @FindBy(xpath = "//*[@id='search_product']")
    private ExtendedWebElement searchProductField;

    @FindBy(xpath = "//*[@id='submit_search']")
    private ExtendedWebElement submitSearchButton;

    @FindBy(xpath = "//a[@data-product-id='1' and contains(@class, 'add-to-cart')]")
    private ExtendedWebElement addToCartButtonOfFirstProduct;

    @FindBy(xpath = "//button[contains(@class, 'btn-success') and text()='Continue Shopping']")
    private ExtendedWebElement continueShoppingButton;

    public ProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(allProductsTitle);
    }

    public ProductDetailPage clickViewProductButtonOfFirstProduct() {
        viewProductButtonOfFirstProduct.click();

        return new ProductDetailPage(driver);
    }

    public void typeProductName(String productName) {
        searchProductField.type(productName);
    }

    public SearchedProductsPage clickSubmitSearchButton() {
        submitSearchButton.click();

        return new SearchedProductsPage(driver);
    }


    public void clickAddToCartButtonOfFirstProduct() {
        addToCartButtonOfFirstProduct.click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }

}
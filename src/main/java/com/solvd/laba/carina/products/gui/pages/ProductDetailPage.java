package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='product-details']//h2")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = "//div[@class='product-details']//p[starts-with(text(), 'Category:')]")
    private ExtendedWebElement productCategory;

    @FindBy(xpath = "//div[@class='product-details']//span/span")
    private ExtendedWebElement productPrice;

    @FindBy(xpath = "//div[@class='product-details']//button[@class='btn btn-default cart']")
    private ExtendedWebElement addToCartButton;

    @FindBy(xpath = "//div[@class='product-details']//p[b[contains(text(), 'Availability:')]]")
    private ExtendedWebElement productAvailability;

    @FindBy(xpath = "//div[@class='product-details']//p[b[contains(text(), 'Condition:')]]")
    private ExtendedWebElement productCondition;

    @FindBy(xpath = "//div[@class='product-details']//p[b[contains(text(), 'Brand:')]]")
    private ExtendedWebElement productBrand;

    public ProductDetailPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(productTitle);
    }

    public boolean isProductTitleDisplayed() {
        return productTitle.isElementPresent();
    }

    public boolean isProductCategoryDisplayed() {
        return productCategory.isElementPresent();
    }

    public boolean isProductPriceDisplayed() {
        return productPrice.isElementPresent();
    }

    public boolean isAddToCartButtonDisplayed() {
        return addToCartButton.isElementPresent();
    }

    public boolean isProductAvailabilityDisplayed() {
        return productAvailability.isElementPresent();
    }

    public boolean isProductConditionDisplayed() {
        return productCondition.isElementPresent();
    }

    public boolean isProductBrandDisplayed() {
        return productBrand.isElementPresent();
    }

}
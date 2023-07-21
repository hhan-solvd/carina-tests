package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class SearchedProductsPage extends AbstractPage {

    @FindBy(xpath = "//h2[contains(.,'Searched Products')]")
    private ExtendedWebElement searchedProductsTitle;

    public SearchedProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(searchedProductsTitle);
    }

    public boolean isSearchedProductsTitleDisplayed() {
        return searchedProductsTitle.isElementPresent();
    }

}

package com.solvd.laba.carina.products.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchedProductsPage extends AbstractPage {

    @FindBy(xpath = "//h2[contains(.,'Searched Products')]")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//h2[contains(.,'Category')]")
    private ExtendedWebElement categoryTitle;

    @FindBy(xpath = "//h2[contains(.,'Brands')]")
    private ExtendedWebElement brandsTitle;

    public SearchedProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(screenTitle);
    }

    public boolean isCategoryTitleDisplayed() {
        return categoryTitle.isElementPresent();
    }

    public boolean isBrandsTitleDisplayed() {
        return brandsTitle.isElementPresent();
    }

}

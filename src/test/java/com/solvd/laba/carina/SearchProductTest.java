package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.solvd.laba.carina.products.gui.pages.ProductsPage;
import com.solvd.laba.carina.products.gui.pages.SearchedProductsPage;
import com.solvd.laba.carina.products.gui.pages.components.NavigationBar;
import com.solvd.laba.carina.products.utils.NavigationUtils;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void searchProductTest() {
        String productName = R.TESTDATA.get("productName");

        HomePage homePage = NavigationUtils.openHomePage(getDriver());
        NavigationBar navigationBar = homePage.getNavigationBar();
        ProductsPage productsPage = navigationBar.clickProductsButton();
        Assert.assertTrue(productsPage.isPageOpened(), "Products page is not opened");
        productsPage.typeProductName(productName);
        SearchedProductsPage searchedProductsPage = productsPage.clickSubmitSearchButton();
        Assert.assertTrue(searchedProductsPage.isPageOpened(), "Searched products page is not opened");
        Assert.assertTrue(searchedProductsPage.isCategoryTitleDisplayed(),
                "Category title is not displayed on searched products page");
        Assert.assertTrue(searchedProductsPage.isBrandsTitleDisplayed(),
                "Brands title is not displayed on searched products page");
        Assert.assertTrue(searchedProductsPage.isProductPresent(productName),
                "Product is not displayed on searched products page");
    }

}

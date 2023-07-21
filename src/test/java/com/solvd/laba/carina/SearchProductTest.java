package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.solvd.laba.carina.products.gui.pages.ProductsPage;
import com.solvd.laba.carina.products.gui.pages.SearchedProductsPage;
import com.solvd.laba.carina.products.utils.TestUtil;
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

        HomePage homePage = new TestUtil().openHomePage();

        ProductsPage productsPage = homePage.clickProductsButton();
        Assert.assertTrue(productsPage.isPageOpened(), "Products page is not opened");
        productsPage.typeProductName(productName);
        SearchedProductsPage searchedProductsPage = productsPage.clickSubmitSearchButton();
        Assert.assertTrue(searchedProductsPage.isSearchedProductsTitleDisplayed(),
                "Searched products are not displayed after clicking on submit search button");
    }

}
package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.ProductsPage;
import com.solvd.laba.carina.products.gui.pages.SearchedProductsPage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.annotations.Test;

public class SearchProductTest extends AbstractBaseTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void searchProductTest() {
        String productName = R.TESTDATA.get("productName");

        ProductsPage productsPage = navigationBar.clickProductsButton();
        productsPage.assertPageOpened();
        productsPage.typeProductName(productName);
        SearchedProductsPage searchedProductsPage = productsPage.clickSubmitSearchButton();
        searchedProductsPage.assertPageOpened();
    }

}

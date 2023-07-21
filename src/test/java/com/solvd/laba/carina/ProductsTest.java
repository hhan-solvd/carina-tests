package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.*;
import com.solvd.laba.carina.products.utils.TestUtil;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void productsTest() {
        HomePage homePage = new TestUtil().openHomePage();

        ProductsPage productsPage = homePage.clickProductsButton();
        Assert.assertTrue(productsPage.isPageOpened(), "Products page is not opened");
        ProductDetailPage productDetailPage = productsPage.clickViewProductButtonOfFirstProduct();
        Assert.assertTrue(productDetailPage.isProductDetailsDisplayed(),
                "Product details are not displayed after clicking on view product button");
    }

}

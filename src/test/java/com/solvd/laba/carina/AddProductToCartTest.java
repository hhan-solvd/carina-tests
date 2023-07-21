package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.CartPage;
import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.solvd.laba.carina.products.gui.pages.ProductsPage;
import com.solvd.laba.carina.products.utils.TestUtil;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCartTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void addProductToCartTest() {
        HomePage homePage = new TestUtil().openHomePage();

        ProductsPage productsPage = homePage.clickProductsButton();
        Assert.assertTrue(productsPage.isPageOpened(), "Products page is not opened");
        productsPage.clickAddToCartButtonOfFirstProduct();
        productsPage.clickContinueShoppingButton();
        CartPage cartPage = homePage.clickCartButton();
        Assert.assertTrue(cartPage.isFirstProductDisplayed(),
                "Product is not added to cart after clicking on add to cart button");
    }

}

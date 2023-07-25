package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.CartPage;
import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.solvd.laba.carina.products.gui.pages.ProductsPage;
import com.solvd.laba.carina.products.gui.pages.components.NavigationBar;
import com.solvd.laba.carina.products.utils.NavigationUtils;
import com.solvd.laba.carina.products.utils.RandomGeneratorUtils;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCartTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void addProductToCartTest() {
        String productId = RandomGeneratorUtils.generateNumber(8);

        HomePage homePage = NavigationUtils.openHomePage(getDriver());
        NavigationBar navigationBar = homePage.getNavigationBar();
        ProductsPage productsPage = navigationBar.clickProductsButton();
        Assert.assertTrue(productsPage.isPageOpened(), "Products page is not opened");
        productsPage.clickAddToCartButtonByProductId(productId);
        productsPage.clickContinueShoppingButton();
        CartPage cartPage = navigationBar.clickCartButton();
        Assert.assertTrue(cartPage.isProductTitlePresent(productId),
                "Product is not added to cart after clicking on add to cart button");
    }

}

package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.CartPage;
import com.solvd.laba.carina.products.gui.pages.ProductsPage;
import com.solvd.laba.carina.products.utils.TestUtil;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCartTest extends AbstractBaseTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void addProductToCartTest() {
        String productId = TestUtil.generateNumber();

        ProductsPage productsPage = navigationBar.clickProductsButton();
        productsPage.assertPageOpened();
        productsPage.clickAddToCartButtonByProductId(productId);
        productsPage.clickContinueShoppingButton();
        CartPage cartPage = navigationBar.clickCartButton(productId);
        Assert.assertTrue(cartPage.isProductDisplayed(),
                "Product is not added to cart after clicking on add to cart button");
    }

}

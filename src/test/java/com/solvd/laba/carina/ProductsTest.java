package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.*;
import com.solvd.laba.carina.products.gui.pages.components.NavigationBar;
import com.solvd.laba.carina.products.utils.NavigationUtils;
import com.solvd.laba.carina.products.utils.RandomGeneratorUtils;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void productsTest() {
        String productId = RandomGeneratorUtils.generateNumber(8);

        HomePage homePage = NavigationUtils.openHomePage(getDriver());
        NavigationBar navigationBar = homePage.getNavigationBar();
        ProductsPage productsPage = navigationBar.clickProductsButton();
        Assert.assertTrue(productsPage.isPageOpened(), "Products page is not opened");
        ProductDetailPage productDetailPage = productsPage.clickViewProductButtonByProductId(productId);
        Assert.assertTrue(productDetailPage.isProductTitleDisplayed(),
                "Product title is not displayed after clicking on view product button");
        Assert.assertTrue(productDetailPage.isProductCategoryDisplayed(),
                "Product category is not displayed after clicking on view product button");
        Assert.assertTrue(productDetailPage.isProductPriceDisplayed(),
                "Product price is not displayed after clicking on view product button");
        Assert.assertTrue(productDetailPage.isAddToCartButtonDisplayed(),
                "Add to cart button is not displayed after clicking on view product button");
        Assert.assertTrue(productDetailPage.isProductAvailabilityDisplayed(),
                "Product availability is not displayed after clicking on view product button");
        Assert.assertTrue(productDetailPage.isProductConditionDisplayed(),
                "Product condition is not displayed after clicking on view product button");
        Assert.assertTrue(productDetailPage.isProductBrandDisplayed(),
                "Product brand is not displayed after clicking on view product button");
    }

}

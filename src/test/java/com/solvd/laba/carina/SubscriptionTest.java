package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.solvd.laba.carina.products.gui.pages.components.SubscriptionComponent;
import com.solvd.laba.carina.products.utils.NavigationUtils;
import com.solvd.laba.carina.products.utils.RandomGeneratorUtils;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void subscriptionTest() {
        String email = RandomGeneratorUtils.generateEmail();

        HomePage homePage = NavigationUtils.openHomePage(getDriver());
        SubscriptionComponent subscriptionComponent = homePage.getSubscriptionComponent();
        subscriptionComponent.typeSubscribeEmail(email);
        subscriptionComponent.clickSubscribeButton();
        Assert.assertTrue(subscriptionComponent.isSuccessSubscribeMessageDisplayed(),
                "Success message is not displayed after clicking on the subscribe button");
    }

}

package com.solvd.laba.carina;

import com.solvd.laba.carina.products.utils.TestUtil;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionTest extends AbstractBaseTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void subscriptionTest() {
        String email = TestUtil.generateEmail();

        homePage.typeSubscribeEmail(email);
        homePage.clickSubscribeButton();
        Assert.assertTrue(homePage.isSuccessSubscribeMessageDisplayed(),
                "Success message is not displayed after clicking on the subscribe button");
    }

}

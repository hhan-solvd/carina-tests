package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.*;
import com.solvd.laba.carina.products.utils.TestUtil;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void subscriptionTest() {
        String email = R.TESTDATA.get("loginEmail");

        HomePage homePage = new TestUtil().openHomePage();

        homePage.typeSubscribeEmail(email);
        homePage.clickSubscribeButton();
        Assert.assertTrue(homePage.isSuccessSubscribeMessageDisplayed(),
                "Success message is not displayed after clicking on the subscribe button");
    }

}

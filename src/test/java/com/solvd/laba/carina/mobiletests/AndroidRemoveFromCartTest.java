package com.solvd.laba.carina.mobiletests;

import com.solvd.laba.carina.saucelabs.common.*;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AndroidRemoveFromCartTest extends AbstractSauceLabsTest {

    @Test()
    @MethodOwner(owner = "hhan")
    public void testRemoveFromCart() {
        String productTitle = R.TESTDATA.get("productTitle");

        CartScreenBase cartScreen = mobileNavigationUtils.openCartScreenWithProductAdded(productTitle);
        cartScreen.clickRemoveButton(productTitle);
        Assert.assertFalse(cartScreen.isProductPresent(productTitle), "Product is not removed from the cart");
    }

}

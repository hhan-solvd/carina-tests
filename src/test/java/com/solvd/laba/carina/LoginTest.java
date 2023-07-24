package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.LoginPage;
import com.solvd.laba.carina.products.gui.pages.SignupLoginPage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends AbstractBaseTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void loginTest() {
        String email = R.TESTDATA.get("loginEmail");
        String password = R.TESTDATA.get("password");

        SignupLoginPage signupLoginPage = navigationBar.clickSignupLoginButton();
        signupLoginPage.assertPageOpened();
        signupLoginPage.typeLoginEmail(email);
        signupLoginPage.typePassword(password);
        LoginPage loginPage = signupLoginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isLogoutButtonDisplayed(),
                "Login page is not opened after clicking on login button");
    }

}

package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.solvd.laba.carina.products.gui.pages.LoginPage;
import com.solvd.laba.carina.products.gui.pages.SignupLoginPage;
import com.solvd.laba.carina.products.utils.TestUtil;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void loginTest() {
        String email = R.TESTDATA.get("loginEmail");
        String password = R.TESTDATA.get("password");

        HomePage homePage = new TestUtil().openHomePage();

        SignupLoginPage signupLoginPage = homePage.clickSignupLoginButton();
        Assert.assertTrue(signupLoginPage.isPageOpened(), "Signup/Login page is not opened");
        signupLoginPage.typeLoginEmail(email);
        signupLoginPage.typePassword(password);
        LoginPage loginPage = signupLoginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isLogoutButtonDisplayed(),
                "Login page is not opened after clicking on login button");
    }

}

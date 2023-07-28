package com.solvd.laba.carina.saucelabs.utils;

import com.solvd.laba.carina.saucelabs.common.LoginScreenBase;
import com.solvd.laba.carina.saucelabs.common.ProductsScreenBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;

public class LoginUtils implements IAbstractTest {

    public ProductsScreenBase loginUser() {
        String username = R.TESTDATA.get("username");
        String password = R.TESTDATA.get("mobilePassword");

        LoginScreenBase loginScreen = initPage(LoginScreenBase.class);
        loginScreen.typeUsername(username);
        loginScreen.typePassword(password);

        return loginScreen.clickLoginButton();
    }

}
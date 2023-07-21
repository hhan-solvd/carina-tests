package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.AccountCreatedPage;
import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.solvd.laba.carina.products.gui.pages.SignupLoginPage;
import com.solvd.laba.carina.products.gui.pages.SignupPage;
import com.solvd.laba.carina.products.utils.TestUtil;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "hhan")
    public void signupTest() {
        String name = R.TESTDATA.get("name");
        String email = R.TESTDATA.get("signupEmail");
        String password = R.TESTDATA.get("password");
        String firstName = R.TESTDATA.get("firstName");
        String lastName = R.TESTDATA.get("lastName");
        String address = R.TESTDATA.get("address");
        String state = R.TESTDATA.get("state");
        String city = R.TESTDATA.get("city");
        String zipcode = R.TESTDATA.get("zipcode");
        String mobileNumber = R.TESTDATA.get("mobileNumber");

        HomePage homePage = new TestUtil().openHomePage();

        SignupLoginPage signupLoginPage = homePage.clickSignupLoginButton();
        Assert.assertTrue(signupLoginPage.isPageOpened(), "Signup/Login page is not opened");
        signupLoginPage.typeName(name);
        signupLoginPage.typeSignupEmail(email);

        SignupPage signupPage = signupLoginPage.clickSignupButton();
        signupPage.typePassword(password);
        signupPage.typeFirstName(firstName);
        signupPage.typeLastName(lastName);
        signupPage.typeAddress(address);
        signupPage.typeCity(city);
        signupPage.typeState(state);
        signupPage.typeZipcode(zipcode);
        signupPage.typeMobileNumber(mobileNumber);

        AccountCreatedPage accountCreatedPage = signupPage.clickCreateAccountButton();
        Assert.assertTrue(accountCreatedPage.isAccountCreatedMessageDisplayed(),
                "Account is not created after clicking on create account button");
    }

}

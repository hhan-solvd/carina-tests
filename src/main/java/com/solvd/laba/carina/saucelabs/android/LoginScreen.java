package com.solvd.laba.carina.saucelabs.android;

import com.solvd.laba.carina.saucelabs.common.LoginScreenBase;
import com.solvd.laba.carina.saucelabs.common.ProductsScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LoginScreenBase.class)
public class LoginScreen extends LoginScreenBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private ExtendedWebElement usernameField;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private ExtendedWebElement loginButton;

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return loginButton.isElementPresent();
    }

    @Override
    public void typeUsername(String username) {
        usernameField.type(username);
    }

    @Override
    public void typePassword(String password) {
        passwordField.type(password);
    }

    @Override
    public ProductsScreenBase clickLoginButton() {
        loginButton.click();
        return initPage(ProductsScreenBase.class);
    }

}

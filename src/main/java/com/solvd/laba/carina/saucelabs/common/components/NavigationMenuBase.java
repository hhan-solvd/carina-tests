package com.solvd.laba.carina.saucelabs.common.components;

import com.solvd.laba.carina.saucelabs.common.AboutScreenBase;
import com.solvd.laba.carina.saucelabs.common.AbstractSauceLabsScreenBase;
import com.solvd.laba.carina.saucelabs.common.LoginScreenBase;
import org.openqa.selenium.WebDriver;

public abstract class NavigationMenuBase extends AbstractSauceLabsScreenBase {

    public NavigationMenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginScreenBase clickLogoutButton();

    public abstract AboutScreenBase clickAboutButton();

}

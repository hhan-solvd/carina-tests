package com.solvd.laba.carina.saucelabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractSauceLabsScreenBase extends AbstractPage {

    public static final String METHOD_IS_NOT_IMPLEMENTED_FOR_I_OS = "Method is not implemented for iOS";

    public AbstractSauceLabsScreenBase(WebDriver driver) {
        super(driver);
    }

    public boolean isOpened() {
        throw new UnsupportedOperationException("isOpened is not implemented for this screen");
    }

}

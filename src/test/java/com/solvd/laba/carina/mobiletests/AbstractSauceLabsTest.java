package com.solvd.laba.carina.mobiletests;

import com.solvd.laba.carina.saucelabs.utils.MobileNavigationUtils;
import com.zebrunner.carina.core.IAbstractTest;

public class AbstractSauceLabsTest implements IAbstractTest {

    protected MobileNavigationUtils mobileNavigationUtils;

    public AbstractSauceLabsTest() {
        this.mobileNavigationUtils = new MobileNavigationUtils();
    }

}

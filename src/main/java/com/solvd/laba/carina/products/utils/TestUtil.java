package com.solvd.laba.carina.products.utils;

import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.zebrunner.carina.core.IAbstractTest;

public class TestUtil implements IAbstractTest {

    public HomePage openHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        return homePage;
    }

}

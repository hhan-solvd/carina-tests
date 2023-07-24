package com.solvd.laba.carina;

import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.solvd.laba.carina.products.gui.pages.components.NavigationBar;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractBaseTest implements IAbstractTest {

    protected HomePage homePage;
    protected NavigationBar navigationBar;

    @BeforeMethod
    public void openHomePage() {
        homePage = new HomePage(getDriver());
        homePage.open();
        navigationBar = homePage.getNavigationBar();
    }

}

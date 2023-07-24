package com.solvd.laba.carina.products.utils;

import com.solvd.laba.carina.products.gui.pages.HomePage;
import com.solvd.laba.carina.products.gui.pages.components.NavigationBar;
import org.openqa.selenium.WebDriver;

public class NavigationUtils {

    public static HomePage openHomePage(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        return homePage;
    }

    public static NavigationBar getNavigationBar(HomePage homePage) {
        return homePage.getNavigationBar();
    }

}


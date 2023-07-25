package com.solvd.laba.carina.products.utils;

import com.solvd.laba.carina.products.gui.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class NavigationUtils {

    public static HomePage openHomePage(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        return homePage;
    }

}


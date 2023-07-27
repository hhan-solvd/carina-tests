package com.solvd.laba.carina.saucelabs.common;

import org.openqa.selenium.WebDriver;

public abstract class LoginScreenBase extends AbstractSauceLabsScreenBase {

	public LoginScreenBase(WebDriver driver) {
		super(driver);
	}

	public abstract void typeUsername(String username);

	public abstract void typePassword(String password);

	public abstract ProductsScreenBase clickLoginButton();

}

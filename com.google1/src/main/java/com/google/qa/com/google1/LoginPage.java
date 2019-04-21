package com.google.qa.com.google1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	// learning new thing.saturday class
	WebDriver driver;

	By username = By.id("username");
	By password = By.name("password");
	By signin = By.xpath("//button[@name=\"login\"]");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void typeUserName() {

		driver.findElement(username).sendKeys("techfiosdemo@gmail.com");

	}

	public void typePassword() {
		driver.findElement(password).sendKeys("abc123");
	}

	public void clickLoginBtn() {
		driver.findElement(signin).click();
	}

}

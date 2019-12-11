package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BaseClass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\cucumber\\feature\\LoginCheck.feature",glue="com.cucumber.stepdefinition.LoginCheck.java"
		)
public class LoginCheck extends BaseClass{
	@BeforeClass
	public static void drowserLaunch() {
		browser("chrome");
		getUrl("http://automationpractice.com/index.php");
	}
@AfterClass
public static void closeBrowser() {
	driverQuit();
}
}

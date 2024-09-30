package com.qa.DriverFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumDriverFactory {

	public AppiumDriver driver=null;
	public static ThreadLocal<AppiumDriver> tlDriver = new ThreadLocal<>();
	
	public AppiumDriver init_driver(String platformName) throws MalformedURLException
	{
		System.out.println("Platform value is: " + platformName);
		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Kalai\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		if (platformName.equals("Android")) {
			UiAutomator2Options options=new UiAutomator2Options();
			options.setDeviceName("FL");
			options.setApp("C:\\Users\\Kalai\\eclipse-workspace\\pf\\src\\test\\resourcess\\resources\\Apps\\Financiallease22.apk");
			tlDriver.set(new AndroidDriver(new URL("http://127.0.0.1:4723"),options));
		} else if (platformName.equals("IOS")) {
			System.out.println("Please pass only android browser value: " + platformName);
	   	}else {
			System.out.println("Please pass the correct browser value: " + platformName);
		}
		return getDriver();
	}
	
	public static synchronized AppiumDriver getDriver() {
		return tlDriver.get();
	}
	
	
}



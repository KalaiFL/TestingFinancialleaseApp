//package com.qa.DriverFactory;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;


//public class BrowserDriverFactory {
		
	//	public WebDriver webdriver=null;
		//public static ThreadLocal<WebDriver> wbDriver = new ThreadLocal<>();
		
		
		//public WebDriver Web_init_driver(String browser) {

			//System.out.println("browser value is: " + browser);

			//if (browser.equals("chrome")) {
				//WebDriverManager.chromedriver().setup();
				//ChromeOptions options=new ChromeOptions();
				//options.addArguments("--disable-notifications");
				//wbDriver.set(new ChromeDriver(options));
			//} else if (browser.equals("firefox")) {
				//WebDriverManager.firefoxdriver().setup();
				//wbDriver.set(new FirefoxDriver());
		//	} else if (browser.equals("safari")) {
			//	wbDriver.set(new SafariDriver());
			//} else {
				//System.out.println("Please pass the correct browser value: " + browser);
			//}

			//getwebDriver().manage().deleteAllCookies();
			//getwebDriver().manage().window().maximize();
			//return getwebDriver();
			//}
		
		//public static synchronized WebDriver getwebDriver() {
			//return wbDriver.get();
		//}


	//}


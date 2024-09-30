package AppHooks;

import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;
import com.qa.DriverFactory.AppiumDriverFactory;
//import com.qa.DriverFactory.BrowserDriverFactory;
import com.qa.utils.ConfigReader;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;
import java.time.Duration;

public class ApplicationHooks {

    public AppiumDriver driver;
    //private BrowserDriverFactory browserDriverFactory;
    private AppiumDriverFactory appiumDriverFactory;
    private ConfigReader configReader;
    public WebDriver webdriver;
    Properties prop;

    @Before(order=0)
    public void getProperty()  {
        configReader = new ConfigReader();
        prop = configReader.init_prop();
    }

    @Before(order=1)
    public void setEnvironmentVariable() {
        setEnv("REACT_NATIVE_PACKAGER_HOSTNAME", "localhost");
    }

    @Before(order=2)
    public void LaunchApp() throws MalformedURLException {
        String platformName = prop.getProperty("platformName");
        appiumDriverFactory = new AppiumDriverFactory();
        driver = appiumDriverFactory.init_driver(platformName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    }

   // @Before(order=3)
    //public void launchBrowser() {
        //String browserName = prop.getProperty("browser");
        //browserDriverFactory = new BrowserDriverFactory();
        //webdriver = browserDriverFactory.Web_init_driver(browserName);
        //webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    //}

    @After(order = 0)
    public void quitApp() {
        driver.quit();
    }

    //@After(order = 1)
    //public void quitBrowser() {
        // webdriver.quit();
    //}

    @After(order = 1)
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            byte[] screenshotData = screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotData, "image/png", "screenshot");
        }
    }

    private void setEnv(String key, String value) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        Map<String, String> environment = processBuilder.environment();
        environment.put(key, value);
    }
}

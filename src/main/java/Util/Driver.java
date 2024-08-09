package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;
    private static Properties properties;

    public static WebDriver initializeDriver(String browser) {
        properties = ConfigReader.getProperties();

        if (properties == null) {
            throw new RuntimeException("Properties file not found!");
        }

        if (browser == null) {
            throw new IllegalArgumentException("Browser name cannot be null");
        }

        String driverPath;
        if (browser.equalsIgnoreCase("chrome")) {
            driverPath = properties.getProperty("chrome.driver.path");
            if (driverPath == null) {
                throw new RuntimeException("Chrome driver path is not specified in the properties file");
            }
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driverPath = properties.getProperty("firefox.driver.path");
            if (driverPath == null) {
                throw new RuntimeException("Firefox driver path is not specified in the properties file");
            }
            System.setProperty("webdriver.gecko.driver", driverPath);
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser name. Please provide 'chrome' or 'firefox'");
        }

        String url = properties.getProperty("url");
        if (url == null) {
            throw new RuntimeException("URL is not specified in the properties file");
        }

        int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout", "10"));
        int impWait = Integer.parseInt(properties.getProperty("implicitlyWait", "10"));

        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return getDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

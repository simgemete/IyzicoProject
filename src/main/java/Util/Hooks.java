package Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class Hooks {
    private Properties properties ;

    @Before
    public void before() {
        properties = ConfigReader.getProperties();
        String browser = properties.getProperty("browser");
        Driver.initializeDriver(browser);
    }

    @After
    public void after() {
        Driver.quitDriver();
    }
}

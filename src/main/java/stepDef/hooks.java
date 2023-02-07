package stepDef;

import config.environment;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class hooks extends environment {
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "/Users/novikadianrenanda/Downloads/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        String urlStaging = "employee.sdcillsy.my.id";

        driver.get(urlStaging);


    }
    @After
    public void after(){
        driver.quit();
    }
}
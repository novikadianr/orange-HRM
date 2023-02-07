package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class environment {
    protected static WebDriver driver;
    public WebDriverWait wait;
    public static int duration = 3;
}

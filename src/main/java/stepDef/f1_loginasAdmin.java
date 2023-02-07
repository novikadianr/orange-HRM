package stepDef;

import config.environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.dashboardAdmin;
import objectRepo.loginPages;
import org.openqa.selenium.WebElement;

public class f1_loginasAdmin extends environment {
    loginPages login = new loginPages();
    field string_field = new field();
    dashboardAdmin dashboardA = new dashboardAdmin();
}

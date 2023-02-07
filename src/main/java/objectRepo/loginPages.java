package objectRepo;

import org.openqa.selenium.By;

public class loginPages {
    By field_username = By.name("username");
    By field_password = By.name("password");
    By btn_login = By.xpath("//*[@type=\"submit\"]");

    public By getBtn_login() {
        return btn_login;
    }

    public By getField_password() {
        return field_password;
    }

    public By getField_username() {
        return field_username;
    }
}

package objectRepo;

import org.openqa.selenium.By;

public class dashboardAdmin {
    By dash_page = By.className("oxd-grid-3 orangehrm-dashboard-grid");
    By menu_PIM = By.className("oxd-main-menu-item active");
    By title_dashboard = By.className("oxd-topbar-header-title");

    public By getDash_page() {
        return dash_page;
    }

    public By getMenu_PIM() {
        return menu_PIM;
    }

    public By getTitle_dashboard() {
        return title_dashboard;
    }
}

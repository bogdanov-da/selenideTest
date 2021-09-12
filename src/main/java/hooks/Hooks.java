package hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

public class Hooks {
    @Before(order = 10)
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        Configuration.headless = true;
        System.out.println("10!");
    }

    @Before(order = 20)
    public void setUp2() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        System.out.println("20!");
    }
}

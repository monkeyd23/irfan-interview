package hooks;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import managers.Base;

public class GuiHooks {

    private final String BASE_URL = "https://www.amazon.in/";

    Base base = new Base();

    @Before(value = "@GuiTest", order = 0)
    public void beforeScenario() {
        base.initializeTestBaseSetup("chrome", BASE_URL);
    }

    @After(value = "@GuiTest", order = 0)
    public void afterScenario() {
        base.initializeTestBaseSetup("chrome", BASE_URL);
    }

}

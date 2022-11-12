package com.TryCloud.step_definition;

import com.TryCloud.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void teardownScenario(){
        // We will implement taking screenshot in this method
        //System.out.println("It will be closing browser using cucumber @After each scenario");
        Driver.closeDriver();
    }
    public void setupScenario(){
        //@Before
        System.out.println("Setting up browser using cucumber @Before each scenario");
        Driver.getDriver().get("URL of your app");
    }

    //@Before (value = "@login", order=2)
    public void setupForLogin(){
        // If you want any code to run before any specific feature/scenario,
        // you can use value= "@tagname" to determine this
        System.out.println("====this will only apply to scenarios with @login tag");
    }

}

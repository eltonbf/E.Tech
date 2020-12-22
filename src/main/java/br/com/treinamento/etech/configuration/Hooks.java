package br.com.treinamento.etech.configuration;

import br.com.treinamento.etech.commons.BaseTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.File;
import java.io.IOException;

public class Hooks {

    @Before(value = "@mobile")
    public void beforeScenarioMobile(){
        BaseTest.getDriver();
    }

    @After(value = "@mobile")
    public void afterScenarioMobile(Scenario scenario) throws IOException {
        File screenshot = Utils.gerarScreenShot(scenario);
        Utils.embedScreenshot(screenshot, scenario.getName());
        BaseTest.closeDriver();
    }
}

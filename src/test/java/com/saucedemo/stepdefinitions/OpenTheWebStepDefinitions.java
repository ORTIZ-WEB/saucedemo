package com.saucedemo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class OpenTheWebStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
    }

    @When("the user opens the web site")
    public void theUserOpensTheWebSite() {
        theActorCalled("User").wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }


}

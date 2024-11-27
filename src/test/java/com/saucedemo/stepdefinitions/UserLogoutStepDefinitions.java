package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.ResultVerification;
import com.saucedemo.tasks.Logout;
import com.saucedemo.uis.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserLogoutStepDefinitions {

    @When("user opens the menu and select logout option")
        public void userSelectLogout(){
            theActorInTheSpotlight().attemptsTo(Logout.on());
        }

    @Then("user sees login page")
    public void userSeesItemsPage() {
        theActorInTheSpotlight().should(seeThat(ResultVerification.isVisible(LoginPage.btnLogin)));
    }
}

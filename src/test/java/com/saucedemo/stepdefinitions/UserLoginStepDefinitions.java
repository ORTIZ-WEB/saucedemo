package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.ResultVerification;
import com.saucedemo.tasks.LoginUser;
import com.saucedemo.uis.PrincipalPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserLoginStepDefinitions {

    @When("^enters (.*) and (.*)$")
    public void entersUserAndPassword(String user,  String password) {
        System.out.println("1 step");
        theActorInTheSpotlight().attemptsTo(LoginUser.on(user, password));
    }

    @Then("user sees items page")
    public void userSeesItemsPage() {
        theActorInTheSpotlight().should(seeThat(ResultVerification.isVisible(PrincipalPage.btnMenu)));
    }
}

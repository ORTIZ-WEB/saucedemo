package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ResultVerification implements Question<Boolean> {

    public Target Element;

    public ResultVerification(Target element) {

        Element = element;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Element.resolveFor(actor).isVisible();
    }

    public static ResultVerification isVisible(Target element) {
        return new ResultVerification(element);
    }

}

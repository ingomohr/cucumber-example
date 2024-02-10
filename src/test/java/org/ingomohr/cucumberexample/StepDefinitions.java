package org.ingomohr.cucumberexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private Belly belly;

    // "so ur telling me Cucumber doesn't support booleans out of the box?" - was
    // what I thought
    // (had to add this after I faced problems w/ a boolean parameter)
    @ParameterType("true|false")
    public Boolean truthValue(String value) {
        return Boolean.parseBoolean(value);
    }

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        if (belly == null) {
            belly = new Belly();
        }
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void I_wait_hour(int hours) {
        assertHasBelly();
        belly.digest(hours);
    }

    @Then("my belly should growl {truthValue}")
    public void my_belly_should_growl(Boolean growls) {
        assertHasBelly();
        assertEquals(growls, belly.growls(), "Belly should growl: " + growls);
    }

    private void assertHasBelly() {
        assertTrue(belly != null, "There's no belly");
    }

}
package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.CandidateInTable;
import tasks.*;
import util.LTestData;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class EmployeeHiringStepDefinitions {

    @Before
    public void prepareStage() {
        setTheStage(new OnlineCast());
    }
    @Given("^the user login with the username \"([^\"]*)\" and the password \"([^\"]*)\"$")
    public void theUserLoginWithTheUsernameAndThePassword(String username, String password) throws Exception {
        theActorCalled("Aleja").wasAbleTo(OpenThe.HRMOrangePage(),Login.with(username,password));
    }

    @When("^realize the hiring process for a new employee$")
    public void realizeTheHiringProcessForANewEmployee(List<LTestData> data) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                AddCandidate.withPersonal(data),
                ScheduleInterview.withInterview(data),
                OfferAndHired.ANewJob()
        );
    }

    @Then("^check the user data and hired status$")
    public void checkTheUserDataAndHiredStatus(List<LTestData> data) throws Exception {
        //theActorInTheSpotlight().should(seeThat(RegisterEmployee.inTheTable(data)));

    }

    @Then("^check the user data (.*), (.*), (.*) and (.*)$")
    public void checkUserDataAndStatus(String vacancy, String firstName, String date,String status) {
        theActorInTheSpotlight().should(
                seeThat(CandidateInTable.matches(vacancy, firstName, date,status), equalTo(true))
        );
    }
}

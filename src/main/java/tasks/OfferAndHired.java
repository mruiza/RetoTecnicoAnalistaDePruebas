package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.OfferJobPage.*;

public class OfferAndHired implements Task {

    public static OfferAndHired ANewJob() {
        return Tasks.instrumented(OfferAndHired.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OFFER_JOB_BUTTON),
                Click.on(SAVE_BUTTON),
                Click.on(HIRE_BUTTON),
                Click.on(SAVE_BUTTON),
                Click.on(RECRUITMENT_LABEL)
        );
    }
}

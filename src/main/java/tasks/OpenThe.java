package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.OrangeHRMPage;

public class OpenThe implements Task {
    OrangeHRMPage orangeHRMPage;

    public static OpenThe HRMOrangePage() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(orangeHRMPage));
    }
}

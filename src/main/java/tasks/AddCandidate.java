package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import util.LTestData;

import static userinterface.AddCandidatePage.*;
import java.util.List;

public class AddCandidate implements Task {
    private final List<LTestData> personalData;

    public AddCandidate(List<LTestData> personalData) {
        this.personalData = personalData;
    }

    public static AddCandidate withPersonal(List<LTestData> data) {
        return Tasks.instrumented(AddCandidate.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RECRUITMENT_LABEL),
                Click.on(ADD_BUTTON),
                Enter.theValue(personalData.get(0).getFirstName()).into(FIRST_NAME_INPUT),
                Enter.theValue(personalData.get(0).getMiddleName()).into(MIDDLE_NAME_INPUT),
                Enter.theValue(personalData.get(0).getLastName()).into(LAST_NAME_INPUT),
                Click.on(VACANCY_SELECT),
                SelectFromOptions.byVisibleText(personalData.get(0).getVacancy()).from(VACANCY_SELECT),
                Enter.theValue(personalData.get(0).getEmailresume()).into(EMAIL_INPUT),
                Click.on(SUBMIT_BUTTON),
                Click.on(SHORLIST_BUTTON),
                Click.on(SHORLIST_SAVE_BUTTON)
        );
    }
}

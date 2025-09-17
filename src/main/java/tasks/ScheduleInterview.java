package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import util.LTestData;

import java.util.List;

import static userinterface.AddCandidatePage.FIRST_NAME_INPUT;
import static userinterface.ScheduleInterviewPage.*;

public class ScheduleInterview implements Task {
    private final List<LTestData> personalData;

    public ScheduleInterview(List<LTestData> personalData) {
        this.personalData = personalData;
    }

    public static ScheduleInterview withInterview(List<LTestData> data) {
        return Tasks.instrumented(ScheduleInterview.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SCHEDULE_INTERVIEW_BUTTON),
                Enter.theValue(personalData.get(0).getInterviewTitle()).into(INTERVIEW_TITLE_INPUT),
                Enter.theValue(personalData.get(0).getInterviewer()).into(INTERVIEWER_INPUT),
                Enter.theValue(personalData.get(0).getDate()).into(DATE_INPUT),
                Click.on(SAVE_BUTTON),
                Click.on(MARK_INTERVIEW_PASSED_BUTTON),
                Click.on(SAVE_BUTTON)
        );


    }
}

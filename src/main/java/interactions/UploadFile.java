package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.AddCandidatePage.*;

public class UploadFile implements Interaction {
    private final String filePath;

    public UploadFile(String filePath) {
        this.filePath = filePath;
    }
    public static UploadFile fromPath(String filePath) {
        return instrumented(UploadFile.class, filePath);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(filePath).into(RESUME_INPUT)
        );
    }
}

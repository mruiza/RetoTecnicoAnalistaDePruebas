package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class UploadFile implements Interaction {
    private final String filePath;
    private final Target target;

    public UploadFile(String filePath, Target target) {
        this.filePath = filePath;
        this.target = target;
    }

    public static UploadFile to(Target target, String filePath) {
        return Tasks.instrumented(UploadFile.class, filePath, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).sendKeys(filePath);

    }
}

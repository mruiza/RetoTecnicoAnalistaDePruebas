package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ScheduleInterviewPage extends PageObject {
    public static final Target SCHEDULE_INTERVIEW_BUTTON = Target.the("Button interview").
            located(By.xpath("//div[@class='orangehrm-recruitment-actions']//button[2]"));
    public static final Target INTERVIEW_TITLE_INPUT = Target.the("TextBox to write interview title").
            located(By.xpath("//label[contains(text(),'Interview Title')]//following::input[1]"));
    public static final Target INTERVIEWER_INPUT = Target.the("TextBox to select interviewer").
            located(By.xpath("//label[contains(text(),'Interview Title')]//following::input[2]"));
    public static final Target DATE_INPUT = Target.the("TextBox to write date").
            located(By.xpath("//label[contains(text(),'Interview Title')]//following::input[3]"));
    public static final Target SAVE_BUTTON = Target.the("Save button").
            located(By.xpath("//div[@class='oxd-form-actions']//following::button[2]"));
    public static final Target MARK_INTERVIEW_PASSED_BUTTON = Target.the("Mark interview passed button").
            located(By.xpath("//div[@class='orangehrm-recruitment-actions']//button[3]"));
}

package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddCandidatePage extends PageObject {
    public static final Target RECRUITMENT_LABEL = Target.the("Button recruitment process").
            located(By.xpath("//a[contains(@href,'viewRecruitmentModule')]"));
    public static final Target ADD_BUTTON = Target.the("TextBox to write username").
            located(By.xpath("//div[@class='orangehrm-header-container']//button[1]"));
    public static final Target FIRST_NAME_INPUT = Target.the("TextBox to write first name").
            located(By.name("firstName"));
    public static final Target MIDDLE_NAME_INPUT = Target.the("TextBox to write middle name").
            located(By.name("middleName"));
    public static final Target LAST_NAME_INPUT = Target.the("TextBox to write last name").
            located(By.name("lastName"));
    public static final Target VACANCY_SELECT = Target.the("Select vacancy").
            located(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
    public static final Target EMAIL_INPUT = Target.the("Select vacancy").
            located(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']//following::input[1]']"));
    public static final Target RESUME_INPUT = Target.the("Select vacancy").
            located(By.xpath("//div[contains(@class,'oxd-file-div')]"));
    public static final Target SUBMIT_BUTTON = Target.the("Select vacancy").
            located(By.xpath("//button[@type='submit']"));
    public static final Target SHORLIST_BUTTON = Target.the("Select vacancy").
            located(By.xpath("//div[@class='orangehrm-recruitment-actions']//following::button"));
    public static final Target SHORLIST_SAVE_BUTTON = Target.the("Select vacancy").
            located(By.xpath("//div[@class='orangehrm-recruitment-actions']//following::button"));

}

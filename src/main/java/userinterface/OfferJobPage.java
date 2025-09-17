package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OfferJobPage extends PageObject {
    public static final Target OFFER_JOB_BUTTON = Target.the("Button offer job").
            located(By.xpath("//div[@class='orangehrm-recruitment-actions']//button[3]"));
    public static final Target SAVE_BUTTON = Target.the("Save button").
            located(By.xpath("//div[@class='oxd-form-actions']//following::button[2]"));
    public static final Target HIRE_BUTTON = Target.the("Button hire").
            located(By.xpath("//div[@class='orangehrm-recruitment-actions']//button[3]"));
    public static final Target RECRUITMENT_LABEL = Target.the("Button recruitment process").
            located(By.xpath("//a[contains(@href,'viewRecruitmentModule')]"));
}

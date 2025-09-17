package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class OrangeHRMPage extends PageObject {

    public static final Target USERNAME_INPUT = Target.the("TextBox to write username").
            located(By.name("username"));
    public static final Target PASSWORD_INPUT = Target.the("TextBox to write password").
            located(By.name("password"));
    public static final Target LOGIN_BUTTON = Target.the("TextBox to write password").
            located(By.xpath("//button[1]"));
}

package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import java.util.List;

public class CandidateInTable implements Question<Boolean> {
    private final String expectedVacancy;
    private final String expectedFirstName;
    private final String expectedDate;
    private final String expectedStatus;

    public CandidateInTable(String expectedVacancy, String expectedFirstName, String expectedDate, String expectedStatus) {
        this.expectedVacancy = expectedVacancy;
        this.expectedFirstName = expectedFirstName;
        this.expectedDate = expectedDate;
        this.expectedStatus = expectedStatus;
    }

    public static CandidateInTable matches(String vacancy, String firstName,String date, String status) {
        return new CandidateInTable(vacancy, firstName, date,status);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> rows = BrowseTheWeb.as(actor).findAll("//div[@class='oxd-table-card']//div//div");

        for (WebElementFacade row : rows) {
            List<WebElementFacade> cells = row.thenFindAll("//div[@class='oxd-table-card']//div//div//div");
            if (cells.size() >= 5) {
                String actualVacancy = cells.get(0).getText().trim();
                String actualFirstName = cells.get(1).getText().trim();
                String actualDate = cells.get(2).getText().trim();
                String actualStatus = cells.get(3).getText().trim();

                if (actualFirstName.contains(expectedFirstName) &&
                        actualVacancy.equals(expectedVacancy) &&
                        actualDate.equals(expectedDate) &&
                        actualStatus.equals(expectedStatus)) {
                    return true; // Encontrado
                }
            }
        }
        return false; // No encontrado
    }
}
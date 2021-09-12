package steps;

import bookStore.pages.RegistrationFormPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.И;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class BaseSteps {

    @И("^открываем страницу$")
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    @И("^заполним поле ввода \"([^\"]*)\" значением \"([^\"]*)\"$")
    public void inputInField(String firstName) {

    }


}

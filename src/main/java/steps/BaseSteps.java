package steps;

import bookStore.pages.RegistrationFormPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.PageObjectFactory;
import com.codeborne.selenide.impl.SelenidePageFactory;
import io.cucumber.java.ru.И;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.*;

public class BaseSteps {

    @И("^открываем страницу$")
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    @И("^заполним поле ввода \"([^\"]*)\" значением \"([^\"]*)\"$")
    public void inputInField(SelenideElement field, String value) {
        field.sendKeys(value);
    }


}

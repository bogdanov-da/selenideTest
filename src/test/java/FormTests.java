import bookStore.pages.RegistrationFormPage;
import com.codeborne.selenide.*;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

@Tag("ui")
@Epic("Book Tests")
@Feature("Form Tests")
public class FormTests {
    private RegistrationFormPage registrationFormPage;

    @BeforeAll
 //   @Step("Set Up")
    static void beforeAll() {
        SelenideLogger.addListener("AllureListener", new AllureSelenide().screenshots(true).savePageSource(true));

        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
    }
/*
    @Test
    @Step("Fill form")
    void fillForm() {
        registrationFormPage = open("automation-practice-form", RegistrationFormPage.class);
        registrationFormPage.inputFirstName("Igorrrr");
        registrationFormPage.inputLastName("Ivanov");
        registrationFormPage.inputEmail("ivanov5555@test.tt");
        registrationFormPage.inputPhone("9009998811");
        registrationFormPage.selectGender(0);
        registrationFormPage.selectHobby(1);
        registrationFormPage.openDateOfBirthMenu();
        registrationFormPage.selectYear("1980");
        registrationFormPage.selectMonth("May");
        registrationFormPage.selectDay(3);
        registrationFormPage.selectState(0);
        registrationFormPage.selectCity(0);
        registrationFormPage.submitBtnClick();
    }
*/
    @Test
    public void chooseFile() {
        open("automation-practice-form");
        $(By.id("uploadPicture")).shouldBe(Condition.exist).sendKeys("/Users/bogdanov/alfa/seleniumTest/src/main/resources/pic.jpeg");
    }

    @Test
    public void clickTests() {
        open("buttons");
        $(By.id("doubleClickBtn")).doubleClick();
        $(By.id("rightClickBtn")).contextClick();
        Assertions.assertTrue($(By.id("doubleClickMessage")).isDisplayed());
        Assertions.assertTrue($(By.id("rightClickMessage")).isDisplayed());
    }
/*
    @Test
    public void drugAndDropTests() {
        open("droppable");
        SelenideElement drugElement = $(By.id("draggable"));
        SelenideElement dropElement = $(By.id("droppable"));
        actions().dragAndDrop(drugElement, dropElement).perform();
        Assertions.assertEquals("rgba(70, 130, 180, 1)", dropElement.getCssValue("background-color"));
    }

    @Test
    public void clickAndHoldTests() {
        open("sortable");
        List<SelenideElement> elementsBeforeMoving = $$(By.cssSelector(".vertical-list-container > div"));
        actions().clickAndHold(elementsBeforeMoving.get(0)).moveToElement(elementsBeforeMoving.get(1)).click().perform();
        List<SelenideElement> elementsAfterMoving = $$(".vertical-list-container > div");
        Assertions.assertEquals("Two", elementsAfterMoving.get(0).getText());
    }

    @Test
    public void alertTests() throws InterruptedException {
        open("alerts");
        SelenideElement alertBtn2 = $(By.id("confirmButton"));
        alertBtn2.click();
        Alert alert2 = Selenide.switchTo().alert();
        alert2.dismiss();
    }


    @Test
    public void checkBorderColorInEmptyFirstNameField() throws InterruptedException {
        open("automation-practice-form");
        SelenideElement firstName = $(By.id("firstName")).scrollIntoView(true);
        $(By.id("submit")).scrollIntoView(true).click();
        firstName.shouldHave(Condition.cssValue("border-color", "rgb(221, 53, 69)"));
    }

    @Test
    public void waitUntilVisibleTest() {
        open("dynamic-properties");
        SelenideElement button = $(By.id("visibleAfter")).shouldBe(Condition.visible);
        button.click();
    }

    @Test
    public void waitUntilDisableTest() {
        open("dynamic-properties");
        SelenideElement button = $(By.id("enableAfter")).shouldBe(Condition.enabled);
        button.click();
    }

    @Test
    public void waitUntilColorChangedTest() {
        open("dynamic-properties");
        SelenideElement button = $(By.id("colorChange")).shouldHave(Condition.cssValue("color", "rgba(220, 53, 69, 1)"), Duration.ofSeconds(5));
        button.click();
    }
    */
}

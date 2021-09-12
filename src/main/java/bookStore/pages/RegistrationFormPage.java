package bookStore.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

public class RegistrationFormPage extends AkitaPage {

    @FindBy(id = "firstName")
    private SelenideElement firstName;

    @FindBy(id = "lastName")
    private SelenideElement lastName;

    @FindBy(id = "userEmail")
    private SelenideElement emailField;

    @FindBy(id = "userNumber")
    private SelenideElement userNumber;

    @FindBy(xpath = "//*[@id='genterWrapper']//label")
    private List<SelenideElement> genderList;

    @FindBy(xpath = "//*[@id='hobbiesWrapper']/div[2]//label")
    private List<SelenideElement> hobbiesList;

    @FindBy(className = "react-datepicker__input-container")
    private SelenideElement dateOfBirth;

    @FindBy(className = "react-datepicker__year-select")
    private SelenideElement yearSelect;

    @FindBy(className = "react-datepicker__month-select")
    private SelenideElement monthSelect;

    @FindBy(css = ".react-datepicker__day")
    private List<SelenideElement> daySelect;

    @FindBy(xpath = "//label[@class='form-file-label']")
    private SelenideElement uploadPicture;

    @FindBy(id = "state")
    private SelenideElement stateBtn;

    @FindBy(css = ".css-11unzgr > div")
    private List<SelenideElement> stateList;

    @FindBy(id = "city")
    private SelenideElement cityBtn;

    @FindBy(css = ".css-26l3qy-menu > div > div")
    private List<SelenideElement> cityList;

    @FindBy(id = "submit")
    private SelenideElement submitBtn;

    @Step("Input first name")
    public void inputFirstName(String frstName) {
        firstName.sendKeys(frstName);
    }

    public void inputLastName(String lstName) {
        lastName.sendKeys(lstName);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPhone(String phone) {
        userNumber.sendKeys(phone);
    }

    public void openDateOfBirthMenu() {
        dateOfBirth.click();
    }

    public void selectGender(int index) {
        genderList.get(index).click();
    }

    public void selectHobby(int index) {
        hobbiesList.get(index).scrollIntoView(true);
        hobbiesList.get(index).click();
    }

    public void selectYear(String value) {
        yearSelect.selectOptionByValue(value);
    }

    public void selectMonth(String value) {
        monthSelect.selectOption(value);
    }

    public void selectDay(int index) {
        daySelect.get(index).click();
    }

    public void selectState(int index) {
        stateBtn.click();
        stateList.get(index).click();
    }

    public void selectCity(int index) {
        cityBtn.click();
        cityList.get(index).click();
    }

    public void submitBtnClick() {
        submitBtn.click();
    }
}

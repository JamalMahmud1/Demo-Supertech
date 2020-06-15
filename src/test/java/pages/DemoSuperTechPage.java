package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DemoSuperTechPage {

    @FindBy(xpath = "//*[@id=\"FN\"]")
    WebElement firstname;

    public void enterFirstName(String fn) {
        firstname.sendKeys(fn);
    }

    @FindBy(xpath = "//*[@id=\"LN\"]")
    WebElement lastname;

    public void enterLastName(String ln) {
        lastname.sendKeys(ln);
    }

    @FindBy(xpath = "//*[@id=\"EM\"]")
    WebElement email;

    public void enterEmail(String em) {
        email.sendKeys(em);
    }

    @FindBy(xpath = "//*[@id=\"PW\"]")
    WebElement password;

    public void enterPassword(String pw) {
        password.sendKeys(pw);
    }

    @FindBy(xpath = "//*[@id=\"PH\"]")
    WebElement phone;

    public void enterPhone(String ph) {
        phone.sendKeys(ph);

    }

    @FindBy(name = "month")
    WebElement month;

    public void SelectMonth(String mn) {
        Select monthSelect = new Select(month);
        monthSelect.selectByVisibleText(mn);
    }

    @FindBy(name = "day")
    WebElement day;

    public void SelectDay(String dy) {
        Select daySelect = new Select(day);
        daySelect.selectByVisibleText(dy);
    }

    @FindBy(name = "year")
    WebElement year;

    public void SelectYear(String yr) {
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText(yr);
    }

    @FindBy(xpath = "//*[@id=\"post-2064\"]/div/div/div/div/section/div/div/div/div/div/div/div/div/div[2]/form/input[6]")
    WebElement male;

    public void ClickOnMale() {
        male.click();

    }

    @FindBy(xpath = "//*[@id=\"post-2064\"]/div/div/div/div/section/div/div/div/div/div/div/div/div/div[2]/form/input[8]")
    WebElement submit;

    public void ClickonSubmit() {
        submit.submit();
    }

    @FindBy(xpath = "/html/body/h1")
    WebElement message;

    public void VerifyMessage(String sms) {
        String actualMessage = message.getText();
        Assert.assertEquals(actualMessage, sms);
    }
}


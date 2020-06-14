package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BNSPage {
    @FindBy(xpath="html/body/div/div[2]/form/input[1]")
    WebElement firstname;
    public void enterFirstName(String Fn) {
        firstname.sendKeys(Fn);
    }
    @FindBy(xpath="html/body/div/div[2]/form/input[2]")
    WebElement lastname;
    public void enterLastName(String Ln) {
        lastname.sendKeys(Ln);
    }
    @FindBy(xpath="html/body/div/div[2]/form/input[3]")
    WebElement email;
    public void enterEmail(String Em) {
        email.sendKeys(Em);
    }
    @FindBy(xpath="//*[@id=\"PW\"]")
    WebElement password;
    public void enterPassword(String Pw) {
        password.sendKeys(Pw);
    }

    @FindBy(xpath="//*[@id=\"PH\"]")
    WebElement phonenumber;
    public void enterPhone(String Ph) {
        phonenumber.sendKeys(Ph);
    }


    @FindBy(xpath="/html/body/div/div[2]/form/select[1]")
    WebElement month;
    public void selectMonth(String Mn) {
        Select monthSelect=new Select(month);
        monthSelect.selectByVisibleText(Mn);

    }
    @FindBy(xpath="/html/body/div/div[2]/form/select[2]")
    WebElement day;
    public void selectDay(String Dy) {
        Select daySelect=new Select(day);
        daySelect.selectByVisibleText(Dy);

    }
    @FindBy(xpath="/html/body/div/div[2]/form/select[3]")
    WebElement year;
    public void selectYear(String Yr) {
        Select yearSelect=new Select(year);
        yearSelect.selectByVisibleText(Yr);

    }
    @FindBy(xpath="/html/body/div/div[2]/form/input[6]")
    WebElement male;
    public void clickOnMale() {
        male.click();



    }
    @FindBy(xpath="/html/body/div/div[2]/form/input[7]")
    WebElement female;
    public void clickOnFemale() {
        female.click();



    }
    @FindBy(xpath="/html/body/div/div[2]/form/input[8]")
    WebElement submit;
    public void clickOnSubmit() {
        submit.submit();



    }
    @FindBy(xpath="//*[contains(text(),'Submitted')]")
    WebElement textMessage;
    public void verifyText(String message) {
        String actualMessage=textMessage.getText();
        Assert.assertEquals(actualMessage,message);




    }
}



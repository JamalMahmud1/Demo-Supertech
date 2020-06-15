package tests;

import basepack.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.DemoSuperTechPage;

public class DemoSuperTest extends BaseClass {

    @Test
    public void DemoSuperTest() throws InterruptedException {
        test = report.createTest("Sign up");
        DemoSuperTechPage dsp = PageFactory.initElements(driver, DemoSuperTechPage.class);
        driver.get("https://bnscorporation.com/demo-website/");
        dsp.enterFirstName("Jamal");
        dsp.enterLastName("Mahmud");
        dsp.enterEmail("jamal@yahoo.com");
        dsp.enterPassword("123");
        dsp.enterPhone("917");
        dsp.SelectMonth("Jan");
        dsp.SelectDay("1");
        dsp.SelectYear("1997");
        dsp.ClickOnMale();
        dsp.ClickonSubmit();
        Thread.sleep(4000);
        dsp.VerifyMessage("Submitted Form Data");

    }

}
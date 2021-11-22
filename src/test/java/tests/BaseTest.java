package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.*;
import steps.LoginSteps;
import steps.MoodUpdateModalSteps;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    LoginPage loginPage;
    FeedPage feedPage;
    MoodUpdatedModalPage moodUpdatedModalPage;
    MyDiaryPage myDiaryPage;
    RateYourHappinessModalPage rateYourHappinessModalPage;

    LoginSteps loginSteps;
    MoodUpdateModalSteps moodUpdateModalSteps;

    @BeforeMethod
    public void init() {
        Configuration.browser = "chrome";
        Configuration.timeout = 30000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        loginPage = new LoginPage();
        feedPage = new FeedPage();
        moodUpdatedModalPage = new MoodUpdatedModalPage();
        myDiaryPage = new MyDiaryPage();
        rateYourHappinessModalPage = new RateYourHappinessModalPage();
    }

    @AfterMethod
    public void quit(){
        getWebDriver().quit();
    }
}

package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginSteps;
import static constants.IConstantsTest.EMAIL;
import static constants.IConstantsTest.PASSWORD;


public class MoodPandaTest extends BaseTest {



    @Test
    public void moodTest() {
        LoginSteps.login(EMAIL, PASSWORD)
                .waitForMoodButtonVisible()
                .clickUpdateMoodButton()
                .updateMood(8);
        int getMoodValue = rateYourHappinessModalPage.getMoodValueHappiness();
        int moodValue = 10;
        Assert.assertEquals(getMoodValue, moodValue);
    }
    @Test(description = "check the number of hugs after clicking")
    public void hugTest() {
        LoginSteps.login(EMAIL, PASSWORD);
        int firstHugs = feedPage.getCountHugs();
        feedPage.clickHug().waitForCommentOpened();
        int lastHugs = feedPage.getCountHugs();
        Assert.assertEquals((firstHugs + 1), lastHugs);
    }

}

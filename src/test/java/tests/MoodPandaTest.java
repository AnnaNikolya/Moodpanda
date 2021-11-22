
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest{

    @Test
    public void moodTest() {
        loginPage.openPage()
                .login("nikolaevna@mailinator.com", "moodpanda")
                .waitForMoodButtonVisible()
                .clickUpdateMoodButton()
                .updateMood(9);
        //TODO: Implement assert
        //Assert.assertEquals();
        Assert.assertEquals(loginPage.login("nikolaevna@mailinator.com", "moodpanda"), null);
    }
}

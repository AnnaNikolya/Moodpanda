package tests;

import javafx.scene.input.InputMethodTextRun;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginSteps;

import static constants.IConstantsTest.EMAIL;
import static constants.IConstantsTest.PASSWORD;

public class MyDiaryPageTest extends BaseTest {


    private InputMethodTextRun element;


    @Test(description = "check the description in the post")
    public void descriptionTest() {
        int moodValue = 8;
        String description = "I'm so happy!";
        LoginSteps.login(EMAIL, PASSWORD);
        moodUpdateModalSteps.updateMoodAndGoToDiary(moodValue, description);
        String textPost = feedPage.getPostText();
        Assert.assertEquals(textPost, description);
    }

}

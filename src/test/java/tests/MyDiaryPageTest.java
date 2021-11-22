import com.codeborne.selenide.SelenideElement;
import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MyDiaryPageTest extends BaseTest{


    private InputMethodTextRun element;

    @Test
    public void openDiary() {
        open("https://moodpanda.com/Feed");
        $(By.xpath("//*[@id='UpdateMood']/div/div/div[3]/button[2]")).click();
        SelenideElement element = $(By.tagName("Support us - become a Patron"));
        if (this.element.getText().equals("Support us - become a Patron")) {
            System.out.println("Match found");
        } else {
            System.out.println("Match Not found");
        }
        Assert.assertEquals(this.element.getText(), "Support us - become a Patron");
    }
}

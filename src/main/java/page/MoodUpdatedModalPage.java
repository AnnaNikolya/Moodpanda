package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedModalPage {
    private static final String MODAL_CONTENT_CSS = "//*[contains(text(),'%s')]/ancestor::*[contains(@class,'modal-content')]";
    private static final String BTN_DIARY_CSS = ".ButtonMyDiary";
    private static final String NAME_MODAL = "Mood Updated";

    public MoodUpdatedModalPage waitForModalOpened() {
        $(By.xpath(String.format(MODAL_CONTENT_CSS, NAME_MODAL))).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }
    public MoodUpdatedModalPage clickBtnUpdate() {
        $(BTN_DIARY_CSS).click();
        return this;
    }

    public MoodUpdatedModalPage clickGoDiary() {
        $(BTN_DIARY_CSS).click();
        return this;
    }
}

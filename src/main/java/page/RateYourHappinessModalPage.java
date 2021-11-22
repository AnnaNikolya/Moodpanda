package page;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;


public class RateYourHappinessModalPage {
    public static final String SLIDER_CSS = ".ui-slider-handle";
    public static final String UPDATE_MOOD_BUTTON = ".btn-primary.ButtonUpdate";
    public static final String BTN_UPDATE_CSS = ".ButtonUpdate";
    public static final String TEXT_MOOD_BTN = "Update Mood to ";


    public MoodUpdatedModalPage updateMood(int moodValue) {

        $(SLIDER_CSS).click();
        int defaultMoodValue = 5;
        Keys direction = null;
        if (moodValue > defaultMoodValue) {
            direction = Keys.ARROW_RIGHT;
        } else if (moodValue < defaultMoodValue) {
            direction = Keys.ARROW_LEFT;
        }
        if (moodValue != defaultMoodValue) {
            for (int i = 0; i < Math.abs(moodValue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        return null;
    }
        public MoodUpdatedModalPage clickBtnUpdate () {
            $(BTN_UPDATE_CSS).click();
            return new MoodUpdatedModalPage();
        }

        public int getMoodValueHappiness() {
            String text = $(BTN_UPDATE_CSS).getText();
            return Integer.parseInt(text.replace(TEXT_MOOD_BTN, ""));
    }
}
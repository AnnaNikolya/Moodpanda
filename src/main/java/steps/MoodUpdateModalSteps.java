package steps;

import page.FeedPage;
import page.MoodUpdatedModalPage;

public class MoodUpdateModalSteps {
    private FeedPage page;

    public MoodUpdateModalSteps() {
        page = new FeedPage();
    }

    public MoodUpdatedModalPage updateMoodAndGoToDiary(int moodValue, String description) {
        return page
                .clickUpdateMoodButton()
                .updateMood(moodValue)
                .clickBtnUpdate()
                .waitForModalOpened()
                .clickGoDiary();
    }
    }


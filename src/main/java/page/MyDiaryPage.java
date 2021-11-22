package page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static page.LoginPage.LOGIN_URL;


public class MyDiaryPage {
    public static final String DIARY_URL = "https://moodpanda.com/Feed";
    public static final String UPDATE_MOOD_BUTTON = ".btn-primary.ButtonUpdate";

    public void openPage(){
        open(LOGIN_URL);
}
    public MyDiaryPage() {
        open(DIARY_URL);
        $(UPDATE_MOOD_BUTTON).click();

    }
}

package steps;

import page.FeedPage;
import page.LoginPage;

public class LoginSteps {
    private static LoginPage page;

    public LoginSteps() {
        page = new LoginPage();
    }

    public static FeedPage login(String email, String password) {
        return page.openPage().login(email, password).waitForMoodButtonVisible();
    }
}

package Main.Methods;

import Main.Objects.LoginXpaths;
import com.microsoft.playwright.Page;

public class LoginMethods {
    private Page page;

    public LoginMethods(Page page) {
        this.page = page;
    }
public void SetLogin(String Username, String Password){
    page.locator(LoginXpaths.LOGIN_USER_NAME_FIELD).fill(Username);
    page.locator(LoginXpaths.LOGIN_PASSWORD).fill(Password);
    page.locator(LoginXpaths.BTN_LOGIN_SUBMIT).click();
}

}

package Main;

import Main.Methods.LoginMethods;
import Main.Objects.LoginXpaths;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.util.Arrays;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class launchBrowser {
    public static void main(String[] args){

        //Launch browser
        Playwright playwright=Playwright.create();
        Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page= browser.newPage();
        page.navigate("https://demo.snipeitapp.com/login");

//        assertThat(page).hasTitle("");
    }
}

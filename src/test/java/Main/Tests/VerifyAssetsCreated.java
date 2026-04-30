package Main.Tests;

import Main.Methods.AssetsMethods;
import Main.Methods.LoginMethods;
import Main.launchBrowser;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.Assert;
import org.testng.annotations.*;

public class VerifyAssetsCreated extends launchBrowser {
    Playwright playwright;
    Browser browser;
    Page page;
    @BeforeTest
    public void setup() {

        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );
        page = browser.newPage();
        page.navigate("https://demo.snipeitapp.com/login");
    }

    @Test(priority = 1)
    void testLogin(){
        LoginMethods loginMethods= new LoginMethods(page);
        loginMethods.SetLogin("admin","password");
    }
    @Test(dependsOnMethods = {"testLogin"},priority = 2)
    void VerifyNewAsset(){
        AssetsMethods assetsMethods= new AssetsMethods(page);
        assetsMethods.createAnAsset();
        assetsMethods.searchID();

    }
    @AfterTest
    public void tearDown() {
        browser.close();
        playwright.close();
    }
}

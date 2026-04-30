package Main.Methods;

import Main.Objects.AssetsXpaths;
import Main.Objects.LoginXpaths;
import com.microsoft.playwright.Page;

import java.security.PublicKey;

public class AssetsMethods {
    private Page page;
    public String TagID;

    public AssetsMethods(Page page) {
        this.page = page;
    }
    public void createAnAsset(){

        page.locator(AssetsXpaths.BTN_CREATE_NEW).click();
        page.locator(AssetsXpaths.BTN_ASSETS_CREATE_NEW).click();
        TagID= page.locator(AssetsXpaths.TXT_ASSET_ID).getAttribute("value").toString();
        //select a model
        page.locator(AssetsXpaths.DD_ASSET_MODEL).click();
        page.locator(AssetsXpaths.TXT_ASSET_MODEL_INPUT).fill("Macbook Pro 13");
        page.locator(AssetsXpaths.DD_ASSET_MODEL_RESULTS).click();

        //select a status
        page.locator(AssetsXpaths.DD_ASSET_MODEL_STATUS).click();
        page.locator(AssetsXpaths.TXT_ASSET_MODEL_INPUT).fill("ready");
        page.locator(AssetsXpaths.DD_ASSET_MODEL_RESULTS).click();
        //select a user
        page.locator(AssetsXpaths.DD_ASSET_USER).click();
        page.locator(AssetsXpaths.TXT_ASSET_MODEL_INPUT).fill("aisha");
        page.locator(AssetsXpaths.DD_ASSET_MODEL_RESULTS).click();
        //submit the form
        page.locator(AssetsXpaths.BTN_SUBMIT).click();

    }
    public void searchID(){
        page.locator(AssetsXpaths.SEARCH_ID).fill(TagID);
        page.locator("tbody tr a").first().click();page.locator("tbody tr a").first().click();
    }
}

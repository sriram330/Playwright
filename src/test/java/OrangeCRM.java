import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OrangeCRM {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        BrowserType browserType =playwright.chromium();
        Browser browser = browserType.launch(

                new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();

        // Go to https://opensource-demo.orangehrmlive.com/
        page.navigate("https://opensource-demo.orangehrmlive.com/");

    // Click #divUsername >> text=Username
      page.click("#divUsername >> text=Username");

    // Fill input[name="txtUsername"]
      page.fill("input[name=\"txtUsername\"]", "Admin");

    // Press Tab
      page.press("input[name=\"txtUsername\"]", "Tab");
    // Fill input[name="txtPassword"]
      page.fill("input[name=\"txtPassword\"]", "admin123");
    // Click input:has-text("LOGIN")
      page.click("input:has-text(\"LOGIN\")");
    // assert page.url().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    // Click text=Welcome Paul
      page.click("text=Welcome Paul");
    // Click text=Logout
      page.click("text=Logout");
    // assert page.url().equals("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

}
}
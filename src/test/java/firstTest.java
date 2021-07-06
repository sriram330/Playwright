import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class firstTest {

    public static void main(String[] args) {
        Playwright  playwright = Playwright.create();
     //   BrowserType browserType =playwright.firefox()
        BrowserType browserType =playwright.chromium();
        Browser browser = browserType.launch(

                new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();

        page.navigate("https://codoid.com/");
        System.out.println(page.title());

        page.click("xpath=//li/a[text()='About Us']");
        page.pause();
        page.click("text=Innovations");
        System.out.println(page.title());
        page.close();

    }
    }


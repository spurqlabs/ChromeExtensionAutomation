package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BaseStep extends TestContext{
    @Before
    public void initCucWeb()
    {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/test/Resources/1.8.2_0.crx"));
        options.addArguments("--remote-allow-origins=*");
        options.setCapability(ChromeOptions.CAPABILITY,options);
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().window().maximize();
    }
    @After
    public void closeWeb()
    {
        driver.quit();
    }
}

package pageobject.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testBase {

    protected WebDriver driver;

    @BeforeMethod
    public void sutup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

package tests;

import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OwnerTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testGithub() {
        String title = driver.getTitle();
        assertEquals("GitHub: Where the world builds software · GitHub", title);
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

}


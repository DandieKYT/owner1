package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OwnerTest extends TestBase {

    @Test
    public void testGithub() {
        Selenide.open("https://ru.wikipedia.org/wiki/");
        $x("//*[@id='Добро_пожаловать_в_Википедию,']").shouldBe(Condition.text("Добро пожаловать в Википедию,"));
    }

}


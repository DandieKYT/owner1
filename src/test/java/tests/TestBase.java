package tests;

import com.codeborne.selenide.Configuration;
import config.OwnerConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class TestBase {
    static OwnerConfig ownerConfig = ConfigFactory.create(OwnerConfig.class, System.getProperties());

    @BeforeAll
    static void beforeAll() {


        Configuration.browserSize = ownerConfig.getBrowserSize();
        Configuration.baseUrl = ownerConfig.getBaseUrl();
        Configuration.browser = ownerConfig.getBrowser();
        Configuration.browserVersion = ownerConfig.getBrowserVersion();
        Configuration.remote = ownerConfig.getRemoteUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }
}

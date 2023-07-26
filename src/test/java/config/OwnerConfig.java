package config;

import org.aeonbits.owner.Config;

public interface OwnerConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://ru.wikipedia.org/wiki/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("FIREFOX")
    String getBrowser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String getRemoteUrl();

    @Key("browserVersion")
    @DefaultValue("")
    String getBrowserVersion();


}

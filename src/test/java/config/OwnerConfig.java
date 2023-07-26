package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:owner.properties"
})
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
    @DefaultValue("http://localhost:4444")
    String getRemoteUrl();

    @Key("browserVersion")
    @DefaultValue("")
    String getBrowserVersion();


}

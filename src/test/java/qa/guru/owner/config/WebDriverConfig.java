package qa.guru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();
    @Key("browserName")
    @DefaultValue("CHROME")
    String getBrowserName();
    @Key("browserVersion")
    String getBrowserVersion();
    @Key("RemoteWebDriver")
    @DefaultValue("true")
    Boolean getRemoteWebDriver();
    @Key("remoteUrl")
    String getRemoteUrl();

}
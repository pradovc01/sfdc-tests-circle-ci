package org.example.core.ui;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.example.core.Env;
import org.example.core.MyRuntimeException;

/**
 * DockerChromeBrowser class that implements IBrowsers.
 */
public class DockerChromeBrowser implements Browser {

    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * {@inheritDoc}
     */
    @Override
    public WebDriver getBrowser() {
        ChromeOptions chromeCapabilities = new ChromeOptions();
        WebDriver driver;
        try {
            driver = new RemoteWebDriver(new URL(Env.getInstance().getDockerUrl()), chromeCapabilities);

        } catch (MalformedURLException e) {
            LOGGER.error("Not instance driver");
            LOGGER.info(e);
            throw new MyRuntimeException("Not instance driver", e);
        }
        return driver;
    }
}
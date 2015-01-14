import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GoogleNewAndBetwayTest extends Baseclass {

    Googleheadlines google = new Googleheadlines();
    SportingBetway sportingBetway = new SportingBetway();

    @Before
    public void openBrowser() {
        //new instance of FirefoxDriver
        driver = new FirefoxDriver();

        //Maximizing the window
        driver.manage().window().maximize();
    }

    @After
    public void close() {
        //kill browser after test
        driver.quit();
    }

    @Test
    public void verifyCaptureNewsText() throws Exception {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        google.googleheadlines();
    }
    @Test
    public void verifycanCaptureSportsBetwayLiveStreamingText() throws Exception {
        sportingBetway.capturelivenews();
    }
}

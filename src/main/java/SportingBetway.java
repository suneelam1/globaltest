import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

/**
 * Created by SUNEELA on 14/01/2015.
 */
public class SportingBetway extends Baseclass {
    public void capturelivenews(){
        driver.get("https://sports.betway.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Live Streaming")).click();
        //Locating List of elements in Live streaming
        List<WebElement> games = driver.findElements(By.xpath("//div[@id='bettinghomenews']/table/tbody/tr//a[contains(@class,'event_name')]"));
        assertNotNull(games);
        System.out.println("\n \n List of " + games.size() + " Games:");
        for (WebElement game : games) {
            System.out.println("game name: is " + game.getText());

        }
    }
}

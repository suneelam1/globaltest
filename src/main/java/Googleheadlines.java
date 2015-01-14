import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by SUNEELA on 14/01/2015.
 */
public class Googleheadlines extends Baseclass {
    public void googleheadlines() {
        driver.get("http://news.google.com/");
        List<WebElement> newsHeadlines = driver.findElements(By.xpath("//table[@class='esc-layout-table']//h2//span[@class='titletext']"));
        assertNotNull(newsHeadlines);
        for (WebElement newsHeadline : newsHeadlines) {
            System.out.println("HeadLine: " + newsHeadline.getText());
        }
    }
}

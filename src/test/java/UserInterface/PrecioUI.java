package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrecioUI extends Config {
    public WebElement clic_precio = driver.findElement(By.xpath("//*[@id=\"bodyconstraint-inner\"]/div[2]/div/div[2]/div[3]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div/div/div[1]/div/div[1]/div/h3/a"));
}

package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DestinoUI extends Config {
    public WebElement clic_destino = driver.findElement(By.id(":rh:"));
}

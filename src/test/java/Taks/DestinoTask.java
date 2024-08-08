package Taks;

import UserInterface.DestinoUI;
import Util.Config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Objects;

public class DestinoTask extends Config{

    public void Destinotest(String destin) throws InterruptedException {

        DestinoUI user = new DestinoUI();
        user.clic_destino.click();
        user.clic_destino.sendKeys(destin);
        Thread.sleep(5_000);

        if(Objects.equals(destin, "Cusco")) {
            DestinoUI seleccionar = new DestinoUI();
            seleccionar.clic_destino.click();
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(4_000);
            actions.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(4_000);
            System.out.println("Default lenguage: " + destin);
        } else {
            System.out.println("Default lenguage: " + destin);
        }
    }

}

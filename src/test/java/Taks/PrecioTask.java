package Taks;

import UserInterface.PrecioUI;
import Util.Config;

public class PrecioTask extends Config {
    public void Preciotest() throws InterruptedException {
        PrecioUI seleccionar = new PrecioUI();
        seleccionar.clic_precio.click();
        Thread.sleep(4_000);
    }
}

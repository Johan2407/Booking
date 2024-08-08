package Taks;

import UserInterface.FechaUI;
import Util.Config;

public class FechaTask extends Config {
    public void Fechatest() throws InterruptedException {
        FechaUI seleccionar = new FechaUI();
        seleccionar.clic_fecha.click();
        Thread.sleep(4_000);
    }
}

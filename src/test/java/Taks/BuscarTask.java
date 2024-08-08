package Taks;

import UserInterface.BuscarUI;
import Util.Config;

public class BuscarTask extends Config{
    public void Buscartest() throws InterruptedException {
        BuscarUI seleccionar = new BuscarUI();
        seleccionar.clic_buscar.click();
        Thread.sleep(5_000);
    }
}

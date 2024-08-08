package StepDefinitions;

import Taks.BuscarTask;
import io.cucumber.java.en.And;

import java.io.IOException;

public class BuscarSD {
    @And("Seleccionamos boton buscar")
    public void buscar() throws InterruptedException, IOException {
        BuscarTask test = new BuscarTask();
        test.Buscartest();
    }
}

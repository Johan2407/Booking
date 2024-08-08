package StepDefinitions;

import Taks.FechaTask;
import io.cucumber.java.en.And;

import java.io.IOException;

public class FechaSD {
    @And("Seleccionamos campo fecha")
    public void fecha() throws InterruptedException, IOException {
        FechaTask test = new FechaTask();
        test.Fechatest();
    }
}

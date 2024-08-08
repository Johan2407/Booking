package StepDefinitions;

import Taks.DestinoTask;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class DestinoSD {
    @Then("Seleccionamos ubicacion {}")
    public void Destino(String destino) throws InterruptedException, IOException {
        DestinoTask test = new DestinoTask();
        test.Destinotest(destino);
    }
}
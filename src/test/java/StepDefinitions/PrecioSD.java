package StepDefinitions;

import Taks.PrecioTask;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class PrecioSD {
    @Then("Seleccionamos precio")
    public void precio() throws InterruptedException, IOException {
        PrecioTask test = new PrecioTask();
        test.Preciotest();
    }
}

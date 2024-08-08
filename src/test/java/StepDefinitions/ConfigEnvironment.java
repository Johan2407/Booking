package StepDefinitions;

import Taks.ConfigEnvironmentTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;


public class ConfigEnvironment {
    @Before
    public void setup(){
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.Browser();
    }
    @After
    public void tearDown(){
        ConfigEnvironmentTask test = new ConfigEnvironmentTask();
        test.tear();
    }
    @Given("Ingresamos a la URL del {}")
    public void Environment_booking(String ambiente){
        ConfigEnvironmentTask test = new ConfigEnvironmentTask();
        test.Environment(ambiente);
    }
}

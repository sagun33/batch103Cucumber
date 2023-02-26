package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.Driver;
public class DataTablesStepDefinitions {
    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {

    }

    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {

    }

    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {

    }

    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {

    }

    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {

    }

    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {

    }

    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {

    }

    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {

    }

    @When("kullanici create buttonuna basar")
    public void kullanici_create_buttonuna_basar() {


    }
}

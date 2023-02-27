package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BlueRentalCarsPage;
import utilities.Driver;

public class BlueRentalCarsStepDefinitions {
    BlueRentalCarsPage blueRentalCarsPage=new BlueRentalCarsPage();
    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);

    }
    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        blueRentalCarsPage.loginLink.click();


    }
    @When("{string} email girer")
    public void email_girer(String string) {
        blueRentalCarsPage.emailBox.sendKeys(string);
        Driver.wait(3);

    }
    @When("{string} sifre girer")
    public void sifre_girer(String string) {
        blueRentalCarsPage.passwordBox.sendKeys(string);
        Driver.wait(3);

    }
    @When("login buttonuna basar")
    public void login_buttonuna_basar() {
        blueRentalCarsPage.loginButton.click();
        Driver.wait(3);

    }
    @Then("login islemi gerçekleşir")
    public void login_islemi_gerçekleşir() {
        assert blueRentalCarsPage.userID.isDisplayed();
        Driver.wait(3);

    }
}

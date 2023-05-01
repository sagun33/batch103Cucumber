package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginlerPage;
import pages.ViceDeanManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05  {
    ViceDeanManagementPage viceDeanManagementPage=new ViceDeanManagementPage();
    Faker faker=new Faker();
    LoginlerPage loginlerPage=new LoginlerPage();

    @Given("Kullanici admin olarak login olur.")
    public void kullanici_admin_olarak_login_olur() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        loginlerPage.login.click();
        loginlerPage.userName.sendKeys(ConfigReader.getProperty("adminusername"));
        loginlerPage.password.sendKeys(ConfigReader.getProperty("adminpassword"));
        loginlerPage.signinLogin.click();
        ReusableMethods.waitFor(2);


    }


    @Given("Admin Menuye tiklar")
    public void admin_menuye_tiklar() {
        viceDeanManagementPage.menuButon.click();
    }

    @Given("Admin Dean Management linkine tiklar")
    public void admin_dean_management_linkine_tiklar() {
        viceDeanManagementPage.viceDeanManagementLink.click();
    }

    @Given("Admin name girer")
    public void admin_name_girer() {

        viceDeanManagementPage.surName.click();
        viceDeanManagementPage.viceDeanName.sendKeys("memmet");

    }

    @Given("Admin surname girer")
    public void admin_surname_girer() {
        viceDeanManagementPage.surName.sendKeys("kaya");
    }

    @Given("Admin birthplace")
    public void admin_birthplace() {
        viceDeanManagementPage.birthPlace.sendKeys(faker.address().city());
        ReusableMethods.waitFor(1);
    }

    @Given("Admin gender girer")
    public void admin_gender_girer() {
        viceDeanManagementPage.radioButtonGenderMale.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Admin dOfbirth girer")
    public void admin_d_ofbirth_girer() {
        viceDeanManagementPage.dateOfBirth.sendKeys(faker.number().numberBetween(0, 13) + "/" + faker.number().numberBetween(0, 31) + "/" + faker.number().numberBetween(1900, 2005));
        ReusableMethods.waitFor(1);
    }

    @Given("Admin phone girer")
    public void admin_phone_girer() {
        viceDeanManagementPage.phoneNumber.sendKeys(faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999));
        ReusableMethods.waitFor(1);
    }

    @Given("Admin ssn girer")
    public void admin_ssn_girer() {

        viceDeanManagementPage.ssn.sendKeys(faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(10, 99) + "-" + faker.number().numberBetween(1000, 9999));
        ReusableMethods.waitFor(1);
    }

    @Given("Admin username")
    public void admin_username() {
        viceDeanManagementPage.username.sendKeys(faker.name().username());
        ReusableMethods.waitFor(1);
    }

    @Given("Admin password")
    public void admin_password() {
        viceDeanManagementPage.password.sendKeys("asdASD12?");
        ReusableMethods.waitFor(1);
    }

    @Given("Admin submit butonuna tiklar")
    public void admin_submit_butonuna_tiklar() {
        viceDeanManagementPage.submit.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Admin sayfanin en altindaki son sayfa okuna tiklar")
    public void admin_sayfanin_en_altindaki_son_sayfa_okuna_tiklar() {
//        ReusableMethods.clickElementByJS(viceDeanManagementPage.pageLinkLastPage);
//        ReusableMethods.waitFor(5);


    }



    @Then("Admin Dean Listteki bilgisini gordugunu dogrular")
    public void admin_dean_listteki_bilgisini_gordugunu_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.isim.isDisplayed());




    }

    @Then("Admin Sayfayi kapatir")
    public void admin_sayfayi_kapatir() {
        Driver.closeDriver();
    }
}

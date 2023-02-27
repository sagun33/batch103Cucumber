package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        monochrome=true,
        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions",   //stepdefinitions path
        tags = "@blueRentalCar",
        dryRun = false

)
public class Runner {
}
//Bu sinif Test caseleri RUN etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir
//Runner class, features file lar ile step defitions i birbirile baglar
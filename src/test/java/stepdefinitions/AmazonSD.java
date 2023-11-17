package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSD {
    AmazonPage ap = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String string) {
        ap.searchKeyword(string);
    }
    @Then("kullanici title da {string} gormelidir")
    public void kullanici_title_da_gormelidir(String string) {
        ap.vaildateResultText(string);
    }
    @Given("kullanici arama sonuclarinin {string} icerdigini test eder")
    public void kullanici_arama_sonuclarinin_icerdigini_test_eder(String string) {
        ap.vaildateResultText(string);
    }
}

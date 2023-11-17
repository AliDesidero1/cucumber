package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class FirstFeatureSD {
    GooglePage gp = new GooglePage();

    @Given("kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @When("kullanici samsung icin arama yapar")
    public void kullanici_samsung_icin_arama_yapar() {
        //gp.handleCookies();
        gp.searchFor("samsung");
    }

    @Then("sayfa basliginin samsung kelimesi icerdigini test eder")
    public void sayfa_basliginin_samsung_kelimesi_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("samsung"));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("kullanici cucumber icin arama yapar")
    public void kullanici_cucumber_icin_arama_yapar() {
        //gp.handleCookies();
        gp.searchFor("cucumber");
    }
    @Then("sayfa basliginin cucumber kelimesi icerdigini test eder")
    public void sayfa_basliginin_cucumber_kelimesi_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("cucumber"));
    }
}

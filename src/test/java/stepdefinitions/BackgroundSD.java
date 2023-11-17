package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;

public class BackgroundSD {
    GooglePage gp = new GooglePage();

    @When("kullanici amazon icin arama yapar")
    public void kullanici_amazon_icin_arama_yapar() {
        gp.searchFor("amazon");
    }
    @Then("sayfa basliginin amazon kelimesi icerdigini test eder")
    public void sayfa_basliginin_amazon_kelimesi_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("amazon"));
    }
    @When("kullanici linkedin icin arama yapar")
    public void kullanici_linkedin_icin_arama_yapar() {
        gp.searchFor("linkedin");
    }
    @Then("sayfa basliginin linkedin kelimesi icerdigini test eder")
    public void sayfa_basliginin_linkedin_kelimesi_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("linkedin"));
    }
}

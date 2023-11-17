package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class HW_ScenarioOutlineSD {
    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String page_url) {
        Driver.getDriver().get(ConfigReader.getProperty(page_url));
    }
    @Then("kullanici {int} sn bekler")
    public void kullanici_sn_bekler(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfa_basliginin_icerdigini_test_eder(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
}


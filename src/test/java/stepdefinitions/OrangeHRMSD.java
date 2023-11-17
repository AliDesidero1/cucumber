package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OrangeHRMPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class OrangeHRMSD {
    OrangeHRMPage orange = new OrangeHRMPage();

    @Given("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("orangeUrl"));
    }
    @Given("kullanici username {string} girer")
    public void kullanici_username_girer(String string) {
        Driver.getDriver().findElement(orange.usernameWE).sendKeys(string);
    }
    @Given("kullanici password {string} girer")
    public void kullanici_password_girer(String string) {
        Driver.getDriver().findElement(orange.passwordWE).sendKeys(string);
    }
    @Given("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        Driver.getDriver().findElement(orange.loginButton).click();
    }
    @Given("scenario fail olur")
    public void scenario_fail_olur() {
        Assert.assertTrue(false);
    }
    @When("kullanici credentiallari girer")
    public void kullanici_credentiallari_girer(io.cucumber.datatable.DataTable dataTable) {
/*

        //1.yol:
        List<String> credentials = dataTable.row(1);
        //data table in 1.satirini return eder.
        Driver.getDriver().findElement(orange.usernameWE).sendKeys(credentials.get(0));
        Driver.getDriver().findElement(orange.passwordWE).sendKeys(credentials.get(1));
        Driver.getDriver().findElement(orange.loginButton).click();
*/

        //2.yol
        List<Map<String, String>> adminCredentials = dataTable.asMaps();
        for(Map<String, String> each : adminCredentials){
            Driver.getDriver().findElement(orange.usernameWE).sendKeys(each.get("username"));
            Driver.getDriver().findElement(orange.passwordWE).sendKeys(each.get("password"));
            Driver.getDriver().findElement(orange.loginButton).click();
            System.out.println(each);
        }
    }

    @When("kullanici invalid credentiallari girer")
    public void kullaniciInvalidCredentiallariGirer(io.cucumber.datatable.DataTable dataTable)  {

        List<Map<String,String>> adminCredentials=dataTable.asMaps();

        for (Map<String,String> each : adminCredentials) {
            Driver.getDriver().findElement(orange.usernameWE).sendKeys(each.get("username"));
            Driver.getDriver().findElement(orange.passwordWE).sendKeys(each.get("password"));
            Driver.getDriver().findElement(orange.loginButton).click();
            System.out.println(each);

            String errorMessage = each.get("error_message");
            String actualData = Driver.getDriver().findElement(orange.errorMessagge).getText();

            Assert.assertEquals(errorMessage,actualData);
        }
    }
}

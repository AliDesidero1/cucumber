package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DortIslemSD {

    private int int1,int2,sonuc;

    @Given("ilk sayi {int}")
    public void ilk_sayi(int sayi) {
        int1 = sayi;
        System.out.println("int1 = " + int1);
    }
    @Given("ikinci sayi {int}")
    public void ikinci_sayi(int sayi) {
        int2 = sayi;
        System.out.println("int2 = " + int2);
    }
    //cucumber edition
    @When("bu sayilar {word} operatorune girdiginde")
    public void bu_sayilar_operatorune_girdiginde(String operator) {
        switch (operator){
            case "+" :sonuc = int1 + int2; break;
            case "-" :sonuc = int1 - int2; break;
            case "*" :sonuc = int1 * int2; break;
            case "/" :sonuc = int1 / int2; break;
        }
        System.out.println("sonuc = " + sonuc);
    }
    @Then("sonuc {int} olmalidir")
    public void sonuc_olmalidir(int sayi) {
        Assert.assertEquals(sayi,sonuc); //expected-actual, Junit
    }
}

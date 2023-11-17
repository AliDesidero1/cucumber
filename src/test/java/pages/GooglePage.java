package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    WebElement cookies;

    @FindBy(id = "APjFqb")
    WebElement searchBox;

    public void searchFor(String keyword) {
        searchBox.sendKeys(keyword);
        searchBox.submit();
    }
    public void handleCookies(){
        if(cookies.isDisplayed()) {
            cookies.click();
        }
    }
}

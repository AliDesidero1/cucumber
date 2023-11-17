package pages;

import org.openqa.selenium.By;

public class OrangeHRMPage {
    public By usernameWE = By.xpath("//input[@name='username']");
    public By passwordWE = By.xpath("//input[@name = 'password']");
    public By loginButton = By.xpath("//button[@type= 'submit']");
    public By errorMessagge = By.xpath("//p[text() = 'Invalid credentials']");

}

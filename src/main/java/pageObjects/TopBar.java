package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends BasePage{

    @FindBy(xpath = "//a[@href='index.html']")
    WebElement homeButton;

    public TopBar(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnHomePage(){
        homeButton.click();
        return new HomePage(driver);
    }
}

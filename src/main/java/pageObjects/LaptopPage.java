package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopPage extends BasePage{

    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    private WebElement addButton;

    TopBar topBar;

    public LaptopPage(WebDriver driver) {
        super(driver);
        topBar = new TopBar(driver);
    }

    public LaptopPage clickOnAddButton(){
        addButton.click();
        try {
            driver.switchTo().alert().accept();
        }
        catch (NoAlertPresentException exception) {

        }
        return this;
    }

    public HomePage clickOnHomePage(){
        return topBar.clickOnHomePage();
    }
}

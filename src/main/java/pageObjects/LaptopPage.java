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

    public LaptopPage clickOnAddButton() throws InterruptedException {
        addButton.click();
        boolean repeat = true;
        while(repeat) {
            try {
                driver.switchTo().alert().accept();
                repeat = false;
                System.out.println("alert shown");
            } catch (NoAlertPresentException exception) {
                System.out.println("alert not shown");
                driver.wait();
            }
        }
        return this;
    }

    public HomePage clickOnHomePage(){
        return topBar.clickOnHomePage();
    }
}

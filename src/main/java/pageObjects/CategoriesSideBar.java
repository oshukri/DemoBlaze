package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesSideBar extends BasePage{

    @FindBy(xpath = "//*[contains(text(), 'Laptops')]")
    private WebElement laptopButton;
    public CategoriesSideBar(WebDriver driver) {
        super(driver);
    }

    public <T> Object clickOnLaptop(Object currentPage){
        waitTillVisible(laptopButton);
        laptopButton.click();
        return currentPage;
    }
}

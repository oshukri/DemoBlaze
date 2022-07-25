package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    CategoriesSideBar categoriesSideBar;
    public HomePage(WebDriver driver) {
        super(driver);
        categoriesSideBar = new CategoriesSideBar(driver);
    }

    public HomePage clickOnLaptopList(){
        return (HomePage) categoriesSideBar.clickOnLaptop(this);
    }

    public LaptopPage clickOnLaptop(String laptopName) {
        String locator = "//*[contains(text(), '"+laptopName+"')]";
        WebElement laptopLink = driver.findElement(By.xpath(locator));
        laptopLink.click();
        return new LaptopPage(driver);
    }
}

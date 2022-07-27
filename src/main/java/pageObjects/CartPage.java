package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CartPage removeItem(String itemName) {
        WebElement deleteButton = locateItemDeleteButton(itemName);
        deleteButton.click();
        return this;
    }

    private WebElement locateItemDeleteButton(String itemName) {
        String locator = "//*[contains(text(), '"+itemName+"')]";
        WebElement itemBox = driver.findElement(By.xpath(locator));
        WebElement itemRow = itemBox.findElement(By.xpath(".."));
        locator = "//*[contains(text(), 'Delete')]";
        return itemRow.findElement(By.xpath(locator));
    }
}

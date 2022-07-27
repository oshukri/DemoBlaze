package testCases;

import org.junit.jupiter.api.Test;

public class BuyLaptopTest extends BaseTest{

    @Test
    public void buyLaptop() throws InterruptedException {
        homePage
                //Add Sony laptop
                .clickOnLaptopList()
                .clickOnLaptop("Sony vaio i5")
                .clickOnAddButton()
                .clickOnHomePage()
                //Add Dell laptop
                .clickOnLaptopList()
                .clickOnLaptop("Dell i7 8gb")
                .clickOnAddButton()
                .clickOnHomePage()
                //remove Dell laptop from cart
                .clickOnCart()
                .removeItem("Dell i7 8gb")
                ;

    }
}

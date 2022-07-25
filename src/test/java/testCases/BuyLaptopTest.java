package testCases;

import org.junit.jupiter.api.Test;

public class BuyLaptopTest extends BaseTest{

    @Test
    public void buyLaptop(){
        homePage
                .clickOnLaptopList()
                .clickOnLaptop("Sony vaio i5")
                .clickOnAddButton()
                .clickOnHomePage();

    }
}

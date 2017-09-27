package tests.google;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.google.GooglePage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import utils.core.BaseTest;

import java.io.IOException;



/**
 * Created with IntelliJ IDEA.
 * User: glebeda
 * Date: 06.07.16
 * Time: 15:21
 * To change this template use File | Settings | File Templates.
 */
@Features("Login page")
@Title("Login page test suite")

public class GoogleTS extends BaseTest {
    private GooglePage page;

    @BeforeMethod
    public void setUp() {
        try {
            page = new GooglePage(driver);
        } catch (IllegalStateException e){}
    }

    @TestCaseId("ID-3417")
    @Title("Search for something")
    @Stories("ID-1700")
    @Test
    public void searchTest() throws IOException {
        System.out.println("We`ve done it, Man!");
/*
        assert(page.getLoginBtnDisplayedProperty());
        assert(page.getLoginFieldDisplayedProperty());
        assert(page.getPassFieldDisplayedProperty());
*/
    }

    @TestCaseId("ID-3418")
    @Title("Second test")
    @Stories("ID-1700")
    @Test
    public void greatTest() throws InterruptedException {
/*
        page.loginIntoApplication(adminData.getLogin(), adminData.getPass());
        page.verifyLoggedUserName(adminData.getFirstName(), adminData.getLastName());
*/
    }

}


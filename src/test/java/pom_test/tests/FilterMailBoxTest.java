/*
 * package pom_test.tests;
 * 
 * import org.openqa.selenium.WebDriver; import org.testng.Assert; import
 * org.testng.Reporter; import org.testng.annotations.AfterClass; import
 * org.testng.annotations.BeforeClass; import org.testng.annotations.Test;
 * 
 * import pom_test.BaseUI; import pom_testtest.pages.pages.HomePage; import
 * pom_testtest.pages.pages.LoginPage; import
 * pom_testtest.pages.pages.LogoutPage;
 * 
 * public class FilterMailBoxTest extends BaseUI{ WebDriver driver; HomePage
 * home; LoginPage login; LogoutPage logout;
 * 
 * @BeforeClass public void setUp() { driver = setUpAndLaunchApp(); }
 * 
 * @Test public void verifyMailFiltering() { login = new LoginPage(driver);
 * login.enterCredentials("sharunbansal", "Testing@1"); home =
 * login.clickSignIn(); home.selectMailBoxFilter("Trash");
 * Assert.assertEquals(home.verifyFilteredMailTabTitle(), "Trash",
 * "[ASSERTION FAILED]: Mail box filter is incorrect");
 * Reporter.log("[ASSERTION PASSED]: Mail box filter is correct", true); }
 * 
 * @AfterClass public void closeBrowser() { driver.quit(); } }
 */
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
 * public class LoginTest extends BaseUI{ WebDriver driver; HomePage home;
 * LoginPage login; LogoutPage logout;
 * 
 * @BeforeClass public void setUp() { driver = setUpAndLaunchApp(); }
 * 
 * @Test public void verifySuccessfulLogIN() { login = new LoginPage(driver);
 * login.enterCredentials("sharunbansal", "Testing@1"); home =
 * login.clickSignIn(); Assert.assertTrue(home.verifyLogOutBtnPresent(),
 * "[ASSERTION FAILED]: User not signed-in");
 * Reporter.log("[ASSERTION PASSED]: User logged in", true);
 * home.checkFilters(); }
 * 
 * @Test public void verifySuccessfulLogOUT() { logout = home.clickLogoutBtn();
 * Assert.assertTrue(logout.verifyLogOut(),
 * "[ASSERTION FAILED]: User not signed-out");
 * Reporter.log("[ASSERTION PASSED]: User logged out", true); }
 * 
 * @AfterClass public void closeBrowser() { driver.quit(); } }
 */
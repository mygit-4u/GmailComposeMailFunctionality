package Tutorial1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo8Test {
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }


  @Test
  public void closeBrowserTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void contactpageTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void homepageTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void loginTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void openBrowserTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setupTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void tearDownTest() {
    throw new RuntimeException("Test not implemented");
  }
}

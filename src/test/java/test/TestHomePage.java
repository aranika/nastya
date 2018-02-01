package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestHomePage {
  @BeforeTest
  public void beforeTest() {
	  (new TestLoginPage()).testLogin("kolia", "empl");
  }

  @AfterTest
  public void afterTest() {
  }


  @Test (groups= {"B"})
  public void test() {
    throw new RuntimeException("Test not implemented");
  }

}

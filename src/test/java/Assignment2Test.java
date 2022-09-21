import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment2Test {
  @DataProvider(name = "DataNames")
  public Object[][] dataConvertNameToInitials() {
    return new Object[][]{
        {"Bruno Mars", "B.M."},
        {"Dave M Jones", "D.M.J."},
        {"MichaelSmith", "M."}
    };
  }

  @Test(dataProvider = "DataNames")
  public void testConvertNameToInitials(String name, String expectedResult) {
    Assert.assertEquals(Assignment2.convertNameToInitials(name), expectedResult);
  }

  @Test
  public void testConvertNameToInitials_null() {
    Assert.assertNull(Assignment2.convertNameToInitials(null));
  }

  @Test
  public void testConvertNameToInitials_empty() {
    Assert.assertEquals(Assignment2.convertNameToInitials(""), "");
  }
}

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

import static io.restassured.RestAssured.*;

public class Assignment1Test {

  @Test
  public void testGetStates() {
    Response response = get("https://datausa.io/api/data?drilldowns=State&measures=Population&year=latest");

    List<String> states = response.jsonPath().getList("data.State");
    HashSet<String> uniqueStates = new HashSet<>(states);

    Assert.assertEquals(uniqueStates.size(), states.size());
  }

  @Test
  public void testGetYears() {
    Response response = get("https://datausa.io/api/data?drilldowns=State&measures=Population&year=latest");

    List<String> years = response.jsonPath().getList("data.Year");
    HashSet<String> year = new HashSet<>(years);

    Assert.assertEquals(year.size(), 1);
  }

}

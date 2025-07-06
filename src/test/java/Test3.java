import Utils.IpProvider;
import io.restassured.RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {

    @Test(dataProvider = "ipProvider", dataProviderClass = IpProvider.class)
    public void test(String ip){

        RestAssured.baseURI = "https://"+ip;
        RestAssured.basePath = "/test/done";

        RestAssured.given().log().all().when().get().then().extract().response().prettyPrint();
    }
}

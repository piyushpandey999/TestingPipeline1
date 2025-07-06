import Utils.IpProvider;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void GetBookings(){
        RestAssured.given().when().get("https://restful-booker.herokuapp.com/booking").then().statusCode(200).extract().response().prettyPrint();
    }

    @Test(dataProvider = "ipProvider", dataProviderClass = IpProvider.class)
    public void testip(String ip){
        RestAssured.baseURI = "https://"+ip;
        RestAssured.basePath = "/test/done";

        RestAssured.given().log().all().when().get().then().extract().response().prettyPrint();

    }
}

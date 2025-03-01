
package rentola.api;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class first {
public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
String Response=given().log().all()
		.when().get("api/users/2")
		.then().log().all().extract().response().asString();
  System.out.println(Response);
		
}
}
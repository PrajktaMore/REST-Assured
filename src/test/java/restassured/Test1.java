//Create simple java class for all requests

package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;
//import static io.restassured.RestAssured.*;



import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Test1 {
	//Checking for status code of the url

@Test
public void get() {

Response r1=RestAssured.get("https://reqres.in/api/users?page=2");
System.out.println(r1.statusCode());
System.out.println(r1.body().asString());
System.out.println(r1.getHeader("Content-Type"));
System.out.println(r1.statusLine());

Assert.assertEquals(200,r1.statusCode());
}
}
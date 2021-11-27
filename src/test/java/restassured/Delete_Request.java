//Create simple java class for all requests

package restassured;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Delete_Request {

	@Test
	public void Del()
	{

		given().
		delete("https://reqres.in/api/users/2").//Get Request link is from 
		//https://reqres.in/ fake api site click on get ,post ,delete etc. 
		//req tab and take the Request link for API request and response link
		then().
		statusCode(204);//204 response means no content available means deleted 

	}

}

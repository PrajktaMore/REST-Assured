//Create simple java class for all requests

package restassured;
import static io.restassured.RestAssured.*;//manually import these 
//annotations for rest assured

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;//to rectify equal to error
//import manually

//Get Method request is for getting the information
public class GetRequest {

	@Test
	public void get()
	{
		given().
		get("https://reqres.in/api/users?page=2").//Get Request link is from 
		//https://reqres.in/ fake api site click on get, post etc. req tab and 
		// take the Request link for API request and response link
		then().//It will check all the statements after then if any statement
		//validation is wrong then it will throw an error
		body("data.id[1]",equalTo(8)).//in above url everything is recorded

		//collected  under data tab so given data.id[2] and index of data 
		//starts from 0 In body we validate the data column
		body("data.first_name",hasItems("George")).//This is for checking
		//the string value check given value in under first_name of data
		statusCode(200);//200 status code means ok
		//Checking for status code of the url
	}

}

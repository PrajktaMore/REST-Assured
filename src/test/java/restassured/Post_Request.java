//Create simple java class for all requests

package restassured;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

//Post request is for adding data
//Post request is in JSON file format as it has key and value pair format

public class Post_Request {

	//To add resources Key and value format is used simple json depedency
	//is used
	
	@Test

	public void test()
	{
		//For any type of data int or String JSON file format is used
		
		JSONObject request1=new JSONObject();
		
		request1.put( "name" , "morpheus");//Post request take Key Value pair
		request1.put("job", "leader");
		
		given().
		body(request1.toJSONString()).//Body of req1 is of JSONString format 
				//type for int or String value we put it will be in this format only
		post("https://reqres.in/api/users").
		then().
		statusCode(201);//201 means validating created req
		
	}
	}



//Create simple java class for all requests

package restassured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Put request is for updating
public class Put_Request {

	@DataProvider(name="put1")

	public Object[][] UserInfo()
	{

		Object[][] data=new Object[][]{

			{"Shri","Singer"},{"Ram","Teacher"}//Updated parameter job of Ram 
			//to teacher
		};
		return data;
	}

	@Test(dataProvider="put1")

	public void test(String name, String job)
	{
		//For any type of data int or String JSON file format is used

		JSONObject request1=new JSONObject();

		request1.put( "name" , name);//Put request take Key Value pair
		request1.put("job", job);

		given().
		body(request1.toJSONString()).//Body of req1 is of JSONString format 
		//type for int or String argument we put it will be in this format only
		put("https://reqres.in/api/users/2").//put request URL
		then().
		statusCode(200);//200 means ok

	}


}

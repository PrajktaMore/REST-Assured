//Create simple java class for all requests

package restassured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Post request is for adding data
//OR To pass multiple records use Data Driven Testing

@Test
public class Post_Request_DataProvider {

	@DataProvider(name="post1")

	public Object[][] UserInfo()
	{
		//		Object[][] data=new Object[2][2];
		//		
		//		data[0][0]="Shri";
		//		data[0][1]="Singer";
		//		
		//		data[1][0]="Ram";
		//		data[1][1]="Dancer";
		//		
		//		return data;

		//OR

		Object[][] data=new Object[][]{

			{"Shri","Singer"},{"Ram","Dancer"}//2 parameters name and job
		};
		return data;
	}

	@Test(dataProvider="post1")

	public void test(String name, String job)
	{
		//For any type of data int or String JSON file format is used

		JSONObject request1=new JSONObject();

		request1.put("name" , name);//Put request take Key Value pair
		request1.put("job", job);

		given().
		header("Content-Type","application/json").//validate the content 
		//type of header
		body(request1.toJSONString()).//Body of req1 is of JSONString format 
		//type for int or String argument we put it will be in this format only
		post("https://reqres.in/api/users").
		then().
		statusCode(201);//201 means validating created req

	}


}

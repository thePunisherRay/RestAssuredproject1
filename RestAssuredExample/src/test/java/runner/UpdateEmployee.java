package runner;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import setup.SetMethod;
import setup.URLSetup;

public class UpdateEmployee {

	public static void putData(int empID) {
		URLSetup.setURL("update/"+empID);
	}

	public static void testPut() {
		Response response = SetMethod.testPut();
		response.then().statusCode(200).body("status", equalTo("success"));
		System.out.println(response.asString());
	}

}

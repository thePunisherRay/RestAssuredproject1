package runner;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import setup.SetMethod;
import setup.URLSetup;

public class DeleteEmployee {
		
	public static void deleteData(int empID) {
		URLSetup.setURL("delete/"+empID);
	}
	
	public static void testDelete() {
		Response response = SetMethod.testDelete();
		response.then().statusCode(204).body("status", equalTo("success"));
		System.out.println(response.asString());
	}
}

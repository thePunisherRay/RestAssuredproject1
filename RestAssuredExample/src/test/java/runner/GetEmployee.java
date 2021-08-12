package runner;

import io.restassured.response.Response;
import setup.SetMethod;
import setup.URLSetup;

public class GetEmployee {
	
	
	public static void getData() {
		URLSetup.setURL("employees");
	}

	public static void testGet() {
		Response response = SetMethod.testGet();
		System.out.println("Response"+response.asString());
	}

}

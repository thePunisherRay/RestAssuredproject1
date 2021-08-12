package runner;

import io.restassured.response.Response;
import setup.SetMethod;
import setup.URLSetup;

public class GetSingleEmployee {

	
	public static void getSpecificData(int empID) {
		URLSetup.setURL("employee/"+empID);
	}

	
	public static void testGetSpecific() {
		Response response = SetMethod.testGet();
		System.out.println("Response"+response.asString());
	}

}

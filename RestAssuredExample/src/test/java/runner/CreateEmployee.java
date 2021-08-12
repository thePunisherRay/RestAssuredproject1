package runner;

import io.restassured.response.Response;
import setup.SetMethod;
import setup.URLSetup;

public class CreateEmployee {


	public static void postData() {
		URLSetup.setURL("create");
	}


	public static Response testPost() {
		Response response = SetMethod.testPost();
		System.out.println("resonse"+response.asString());
		return response;
	}
}

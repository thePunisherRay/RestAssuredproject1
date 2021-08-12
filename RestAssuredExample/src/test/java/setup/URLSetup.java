package setup;

import io.restassured.RestAssured;

public class URLSetup {

	public static void setURL(String basePath) {
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/";
	RestAssured.basePath=basePath;
	System.out.println("URL is "+RestAssured.baseURI+RestAssured.basePath);
	}
}

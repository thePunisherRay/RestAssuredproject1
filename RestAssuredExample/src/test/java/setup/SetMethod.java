package setup;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import utils.RestUtils;

public class SetMethod {

	public static Response testPost() {
		Response userResponse = given().contentType("application/json")
				.body(RestUtils.setJson()).header("Connection", "keep-alive").when().post().then().extract().response();
		return userResponse;
	}

	public static Response testGet() {
		Response userResponse = given().param("limit", 2).contentType("application/json")
				.header("Connection", "keep-alive").when().get().then().extract().response();
		return userResponse;
	}

	public static Response testPut() {
		Response userResponse =given().contentType("application/json").header("Connection", "keep-alive").body(RestUtils.setJson()).header("Connection", "keep-alive").when()
				.put().then().extract().response();
		return userResponse;
	}
	
	public static Response testDelete() {
		Response userResponse =given().contentType("application/json").header("Connection", "keep-alive").header("Connection", "keep-alive").when()
				.delete().then().extract().response();
		return userResponse;
	}
}

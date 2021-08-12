package script;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import runner.CreateEmployee;
import runner.DeleteEmployee;
import runner.GetEmployee;
import runner.GetSingleEmployee;
import runner.UpdateEmployee;

public class Script1 {

	Response response = null;
	int empID;

	@Test(priority = 1)
	public void Get() {
		System.out.println("Get API call");
		GetEmployee.getData();
		GetEmployee.testGet();
	}

	@Test(priority = 2)
	public void Post() {
		System.out.println("POST API call");
		CreateEmployee.postData();
		response = CreateEmployee.testPost();
		Map<String, Integer> data = response.jsonPath().getMap("data");
		empID = data.get("id");
	}

	@Test(priority = 3)
	public void Put() {
		System.out.println("Put API call");
		UpdateEmployee.putData(empID);
		UpdateEmployee.testPut();
	}

	@Test(priority = 4)
	public void GetSingle() {
		System.out.println("Get Specific API call");
		GetSingleEmployee.getSpecificData(empID);
		GetSingleEmployee.testGetSpecific();
	}

	@Test(priority = 5)
	public void delete() {
		System.out.println("Delete API call");
		DeleteEmployee.deleteData(empID);
		DeleteEmployee.testDelete();
	}
}

package restassuredTests;

import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class Delete_RequestDemo {
	@Test
	public void delete_User() {
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/1";
		
//		Response response=
		given()
			.when()
				.delete()
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.log().all()
				.assertThat().body("message", equalTo("Successfully! Record has been deleted"));
//				.extract().response();
		
//		String jsonAsString=response.asString();
//		Assert.assertEquals(jsonAsString.contains("Successfully! Record has been deleted"), true);
	}
}

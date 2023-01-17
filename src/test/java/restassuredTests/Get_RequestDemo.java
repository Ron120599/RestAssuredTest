package restassuredTests;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Get_RequestDemo {
	
	@Test
	public void getWeatherDetails() {
		RestAssured.baseURI="https://demoqa.com/utilities";
		RestAssured.basePath="/weather/city/Kolkata";
		given()
		.when()
			.get()
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("City", equalTo("Kolkata"))
			.header("Content-Type", "application/json; charset=utf-8");
		
	}
}

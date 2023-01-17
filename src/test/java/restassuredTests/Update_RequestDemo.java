package restassuredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Update_RequestDemo {
	@Test
	public void update_User(){
		RestAssured.baseURI="https://reqres.in/api/users/2";
		String userData="{"+ "\"name\": \"Rohit Sharma\","+ "\"job\": \"Batsman\""+"}";
		given()
			.body(userData)
				.when()
					.put()
				.then()
					.log().all()
					.assertThat().statusCode(200)
					.body("updatedAt",is(notNullValue()));
	}
}

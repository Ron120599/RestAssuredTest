package restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Post_RequestDemo {
	
	@Test
	public void post_User(){
		RestAssured.baseURI="https://reqres.in/api/users";
		String userData="{"+ "\"name\": \"Anuran\","+ "\"job\": \"Developer\""+"}";
		given()
			.body(userData)
				.when()
					.post()
				.then()
					.log().all()
					.assertThat().statusCode(201)
					.body("id",is(notNullValue()));
	}
}

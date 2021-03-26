
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetTest {

	@Test
	public void GetPosts() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();
		System.out.println("Response Body is =>  " + response.asString());
	}
}

package com.api;

import static org.hamcrest.Matchers.containsString;

import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class PokemonApi {

	@Test
	public void getSquirtleData() {
		
		String body = RestAssured
				.given()
					.baseUri("https://pokeapi.co")
				.when()
					.get("/api/v2/pokemon/squirtle")
				.then()
					.log().all()
					.assertThat().statusCode(200)
					.assertThat().body(containsString("abilities"))
					.and().extract().body().asString();
				
		
		JSONObject user = new JSONObject(body);
        System.out.println(user.get("types"));
	}
	
}

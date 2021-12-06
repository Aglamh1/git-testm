package com.api;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import java.util.List;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import com.google.gson.gson;
import com.google.gson.gsonbuilder;

public class GrandPrix {

	@Test
	public void getGPResponse() {
		
		
		
	}
	
	@Test
	public void albertParkGrandPrix() throws JsonMappingException, JsonProcessingException {
		/*
		String body = RestAssured
                .given()
                    .baseUri("http://swapi.co/api")
                    .and()
                    .queryParam("format", "json")
                    //.pathParam(null, isEmptyOrNullString())
                .when()
                    .get("/")
                .then()
                    .log().all()
                    .and().assertThat().statusCode(is(equalTo(200)))
                    .and()
                    .body("films", response -> notNullValue())
                    .body("vehicles", response -> notNullValue())
                    .body("people", response -> notNullValue())
                    .body("starships", response -> notNullValue())
                    .body("species", response -> notNullValue())
                    .body("planets", response -> notNullValue())
                    .and().extract().body().asString();
        JsonPath js = new JsonPath(body);*/
		
        String body = RestAssured
        		.given()
        			.baseUri("http://ergast.com")
        		.when()
        			.get("/api/f1/2017/circuits.json")
        		.then()
        			.log().all()
        			//.body("count", response -> notNullValue())
        			.assertThat().statusCode(is(equalTo(200)))
        			.assertThat().body(containsString("f1"))
        			.assertThat().body(containsString("20"))
        			.assertThat().body(containsString("Albert Park Grand Prix Circuit"))
        			//.body("total", equalTo("20"))
        			.and().extract().body().asString();
        
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.readValue(body, new TypeReference<Map<String,Object>>(){});
        //System.out.println(map);
        System.out.println(map.values());
        
        //gson gson = new gsonbuilder().create();
        //GPDeserialize address = gson.fromjson(json, GPDeserialize.class);
        
        
        //List<GrandPrix> list = objectMapper.readValue(body, new TypeReference<List<GrandPrix>>(){});
        
        
        
        /*
        JsonPath js = new JsonPath(body);
        String melbourne = js.getString("MRData.CircuitTable.Circuits[0].Location");
        System.out.println(melbourne);
        
        JsonPath lat = js.peek();
        System.out.println(lat.toString());
        */
        
		/*
		RestAssured.baseURI = "http://ergast.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/api/f1/2017/circuits.json");
		ResponseBody body = response.getBody();
		//System.out.println(body.path("MRData.CircuitTable.Circuits[0].Location"));
		Assert.assertEquals(body.path("MRData.CircuitTable.Circuits[0].Location.locality"), "Melbourne");
		Assert.assertEquals(body.path("MRData.CircuitTable.Circuits[0].Location.lat"), "-37.8497");
		Assert.assertEquals(body.path("MRData.CircuitTable.Circuits[0].Location.long"), "144.968");
		*/
	}
	
}

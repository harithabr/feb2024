package com.api.test;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class PetStore {

	
long id;
	
	@Test
	public void addPets() {
        System.out.println("Adding pets to the store");
        RestAssured.baseURI = "https://petstore.swagger.io/";
        
        String json = "{"
        		+ "  \"id\": 0,"
        		+ "  \"category\": {"
        		+ "    \"id\": 0,"
        		+ "    \"name\": \"Cat1\""
        		+ "  },"
        		+ "  \"name\": \"doggie\","
        		+ "  \"photoUrls\": ["
        		+ "    \"string\""
        		+ "  ],"
        		+ "  \"tags\": ["
        		+ "    {"
        		+ "      \"id\": 0,"
        		+ "      \"name\": \"string\""
        		+ "    }"
        		+ "  ],"
        		+ "  \"status\": \"available\""
        		+ "}";
        
		Response response = given().header("Content-Type", "application/json").header("accept", "application/json")
			.body(json).when().post("/v2/pet");
		response.then().statusCode(200);
		System.out.println(response.prettyPrint());
		
		id = response.path("id");
		System.out.println(id);
		
		response.then().body("status",  Matchers.equalTo("available")).body("category.name",  Matchers.equalTo("Cat1"))
		.and().body("tags[0].name",  Matchers.equalTo("string")).body("name", Matchers.equalTo("doggie"));
		
	}
	
	@Test(dependsOnMethods = {"addPets"})
	public void putPets() {
        System.out.println("Updating pets to the store");
        RestAssured.baseURI = "https://petstore.swagger.io/";
        
        String json = "{"
        		+ "  \"id\": "+id +","
        		+ "  \"category\": {"
        		+ "    \"id\": 0,"
        		+ "    \"name\": \"string\""
        		+ "  },"
        		+ "  \"name\": \"doggie\","
        		+ "  \"photoUrls\": ["
        		+ "    \"string\""
        		+ "  ],"
        		+ "  \"tags\": ["
        		+ "    {"
        		+ "      \"id\": 0,"
        		+ "      \"name\": \"string\""
        		+ "    }"
        		+ "  ],"
        		+ "  \"status\": \"available\""
        		+ "}";
        
		Response response = given().header("Content-Type", "application/json").header("accept", "application/json")
			.body(json).when().put("/v2/pet");
		response.then().statusCode(200);
		System.out.println(response.prettyPrint());
	}
	
	@Test(dependsOnMethods = {"addPets", "putPets"})
	public void getPet() {
		 System.out.println("Getting pets from the store");
        RestAssured.baseURI = "https://petstore.swagger.io/";
        
        Response response = given().header("accept", "application/json").when().get("/v2/pet/"+id );
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());
    
	}
	
	@Test(dependsOnMethods = {"addPets", "putPets", "getPet"})
	public void deletePet() {
		System.out.println("Deleting pets from the store");
		RestAssured.baseURI = "https://petstore.swagger.io/";

		Response response = given().when().delete("/v2/pet/"+id);
		response.then().statusCode(200);
		System.out.println(response.prettyPrint());
	}
	
	@Test
	public void getPetsByStatus() {
		System.out.println("Getting pets by status from the store");
        RestAssured.baseURI = "https://petstore.swagger.io/";

        Response response = given().header("accept", "application/json").when().get("/v2/pet/findByStatus?status=available");
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());
	}
	
}
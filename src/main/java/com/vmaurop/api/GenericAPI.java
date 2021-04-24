package com.vmaurop.api;

import com.vmaurop.configuration.GoogleConfig;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Autowired;


public class GenericAPI {

    @Autowired
    private GoogleConfig googleConfig;


    protected RequestSpecification getGenericApiReqSpec() {
        String baseUri = googleConfig.getUrl().toString();
        return new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .build();
    }

    protected Response apiGenericGet(String path) {
        return RestAssured
                .given().relaxedHTTPSValidation().contentType(ContentType.JSON).
                        spec(getGenericApiReqSpec()).
                        when().log().all().
                        get(path)
                .then().log().all().
                        extract().
                        response();
    }

    protected Response apiGenericPost(String bodyJson, String path) {
        return RestAssured
                .given().relaxedHTTPSValidation().contentType(ContentType.JSON).
                        spec(getGenericApiReqSpec()).
                        body(bodyJson)
                .when().log().all().
                        post(path)
                .then().log().all().
                        extract().
                        response();
    }


}

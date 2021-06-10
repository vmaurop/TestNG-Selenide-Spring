package com.vmaurop.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.context.annotation.Configuration;

import static com.vmaurop.api.PathBuilder.TRANSLATION_REQUEST;


@Configuration
public class EuroNiceAPI {


    private Response responseTranslationRequest;


    protected RequestSpecification getGenericApiReqSpec(String apiUri) {
        return new RequestSpecBuilder()
                .setBaseUri(apiUri)
                .build();
    }

    protected Response apiGenericGet(String apiUri, String path) {
        return RestAssured
                .given().relaxedHTTPSValidation().contentType(ContentType.JSON).
                        spec(getGenericApiReqSpec(apiUri)).
                        when().log().all().
                        get(path)
                .then().log().all().
                        extract().
                        response();
    }

    protected Response apiGenericPost(String apiUri, String bodyJson, String path) {
        return RestAssured
                .given().relaxedHTTPSValidation().contentType(ContentType.JSON).
                        spec(getGenericApiReqSpec(apiUri)).
                        body(bodyJson)
                .when().log().all().
                        post(path)
                .then().log().all().
                        extract().
                        response();
    }


    public void postTranslationRequest(String apiUri, String requestBodyJson) {
        responseTranslationRequest = apiGenericPost(apiUri, requestBodyJson, TRANSLATION_REQUEST);
    }
}

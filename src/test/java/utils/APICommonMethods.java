package utils;

import static io.restassured.RestAssured.given;

import APISteps.GenerateTokenSteps;
import io.restassured.specification.RequestSpecification;

public class APICommonMethods {

    /**
     *  Use this method to prepare and create an employee
     *
     * @return
     */

    public static RequestSpecification createEmployeeRequest(String createEmployeePaylod) {

        RequestSpecification request = given().header(apiConstants.Header_Content_type, apiConstants.Content_type)
                .header(apiConstants.Header_Authorization, GenerateTokenSteps.token)
                .body(createEmployeePaylod);

        return request;
    }



}

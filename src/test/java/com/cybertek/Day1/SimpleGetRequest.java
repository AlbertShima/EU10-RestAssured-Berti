package com.cybertek.Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SimpleGetRequest {
    String url = "http://44.201.110.201:8000/api/spartans";





    @Test
    public void test1() {


        Response response = RestAssured.get(url);
        //print response status code
        System.out.println(response.statusCode());

        //print response body
        response.prettyPrint();

    }


}

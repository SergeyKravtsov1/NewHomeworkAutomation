package config;

import dtousersDto.Person;
import dtousersDto.User;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UsersHttpRequest extends BaseHttpRequest {
    private static final String userUrl = "api/users";

    public Response getUsers(String id) {
        return getRequestSpecification()
                .when()
                .get(userUrl +"/"+ id);
    }

    public Response createUser(Person person) {
        return getRequestSpecification()
                .when()
                .body(person)
                .post(userUrl);
    }
}

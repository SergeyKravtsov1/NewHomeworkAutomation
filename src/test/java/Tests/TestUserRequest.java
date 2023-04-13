package Tests;
import dtousersDto.User;
import dtousersDto.UserDetail;
import io.restassured.RestAssured;
import config.UsersHttpRequest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static dtousersDto.TestData.support;
import static dtousersDto.TestData.user;

public class TestUserRequest {

    private UsersHttpRequest usersHttpRequest = new UsersHttpRequest();

    @Test
    public void testGetUser(){
        Response response = usersHttpRequest.getUsers("2");
        UserDetail userDetail = response.then()
                .statusCode(200);
                .extract()
                .as(UserDetail.class);

        Assertions.assertEquals(user,userDetail.getData());
        Assertions.assertEquals(support,userDetail.getSupport());

        @Test
        public void testGetUser(){
            Response response = usersHttpRequest.getUsers("2");
            User user = response.then()
                    .statusCode(200);
                    .extract()
                    .json.Path()
                            .getObject("data", User.class);

                    Assertions.assertEquals(user, user);

            Assertions.assertEquals(user,userDetail.getData());
            Assertions.assertEquals(support,userDetail.getSupport());



            @Test
            public void testGetUser(){
                Response response = usersHttpRequest.getUsers("2");
                Integer userId = response.then()
                        .statusCode(200);
                        .extract()
                        .json.Path()
                        .getInt("dat.id");

                Assertions.assertEquals(user, user);

                Assertions.assertEquals(userId,2);
        }
}

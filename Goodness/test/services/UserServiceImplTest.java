package services;

import data.model.User;
import dto.request.RegisterUserRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    private UserService userService;

    @BeforeEach
    public void setUp(){
        userService = new UserServiceImpl();
    }
    @Test
    public void registerUserTest(){
        RegisterUserRequest request = new RegisterUserRequest();

        request.setPhoneNumber("phonenumber");
        request.setAddress("address");
        request.setEmail("egege");
        request.setLastName("sgse");
        request.setFirstName("rwgsgs");

        User user = userService.registerNewUser(request);
        assertEquals(1,user.getId());
        User foundUser = userService.findUser(1);
        assertEquals(user,foundUser);
    }

}
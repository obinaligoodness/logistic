package services;

import data.model.User;
import dto.request.RegisterUserRequest;

public interface UserService {
    User registerNewUser(RegisterUserRequest request);
    User findUser(int id);
}

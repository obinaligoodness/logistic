package services;

import data.model.User;
import data.repository.UserRepository;
import data.repository.UserRepositoryImpl;
import dto.request.RegisterUserRequest;

public class UserServiceImpl implements UserService{
    UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public User registerNewUser(RegisterUserRequest request) {
        User user = new User();
        user.setAddress(request.getAddress());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User findUser(int id) {
        return userRepository.findById(id);
    }
}

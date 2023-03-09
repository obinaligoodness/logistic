package data.repository;
import data.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private int count;
    private List<User> users =new ArrayList<>();



    public User save(User aUser) {
        boolean isSaved = aUser.getId()!=0;
        if (isSaved)update(aUser);else saveNew(aUser);
        return aUser;
    }

    private void saveNew(User aUser){
        users.add(aUser);
        aUser.setId(generateId());
        count++;
    }

    private void update(User aUser){
//        Package savedPackage = findById(aPackage.getId());
//        int indexOfSavedPackage = packages.indexOf(savedPackage);
//        packages.set(indexOfSavedPackage,aPackage);

        User savedPackage = findById(aUser.getId());
        users.remove(savedPackage);
        users.add(aUser);
    }

    private int generateId() {
        return    count+1;
    }

    public void delete(User aUser) {
        users.remove(aUser);
    }

    public void delete(int id) {
        users.remove(id);
    }

    public List<User> findAll() {
        return null;
    }

    public User findById(int id) {
        for(User aUser: users) if (aUser.getId() == id) return aUser;
        return null;
    }

    public long count() {
        return count;
    }
}

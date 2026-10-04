package in.coderarmy.service;

import in.coderarmy.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {

    private Map<Integer,User> userDB ;

    public UserService(){
        userDB = new HashMap<>();
    }

    public User createUser(User userReq){
        userDB.put(userReq.getId(),userReq);
        return userReq;
    }
    public List<User> getAllUsers(){
        return (List<User>) userDB.values();
    }

    public User getUserById(Integer id){
        return userDB.get(id);
    }
    private User updateUser(User updatedUser) {
        for(int i = 0; i < userDB.size(); i++) {
            if(userDB.get(i).getId() == updatedUser.getId()) {
                userDB.set(i, updatedUser);
                return updatedUser;
            }
        }
        return null;
    }
}

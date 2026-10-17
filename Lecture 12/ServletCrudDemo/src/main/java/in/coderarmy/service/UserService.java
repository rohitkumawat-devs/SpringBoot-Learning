package in.coderarmy.service;

import in.coderarmy.model.User;

import java.util.ArrayList;
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
        List<User> usersResp = new ArrayList<>();
        for(User user : userDB.values()){
            usersResp.add(user);
        }
        return usersResp;
    }

    public User getUserById(Integer id){
        return userDB.get(id);
    }

//    private User updateUser(User updatedUser) {
//        for(int i = 0; i < userDB.size(); i++) {
//            if(userDB.get(i).getId() == updatedUser.getId()) {
//                userDB.set(i, updatedUser);
//                return updatedUser;
//            }
//        }
//        return null;
//    }

    public User updateUser(User updatedUser){
        if(!userDB.containsKey(updatedUser.getId())){
            return null;
        }
        userDB.put(updatedUser.getId(),updatedUser);
        return updatedUser;
    }
    public boolean deleteUser(Integer id){
        return userDB.remove(id)!=null;
    }
}

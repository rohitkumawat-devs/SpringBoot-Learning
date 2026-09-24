package in.coderarmy;

import java.util.List;

public class UserService {

//    private List<String> userNames;
//    public UserService( List<String> userNames){
//        this.userNames = userNames;
//        System.out.println("User Service Created");
//    }
//
//    public List<String> getUserNames(){
//        return userNames;
//    }

    public UserService(){
        System.out.println("User Service Created");
    }

    public void init(){
        System.out.println("Post Construct Phase");
    }

    public void cleanup(){
        System.out.println("Pre Destroy Phase");
    }
}

package user;

import java.util.HashMap;
import java.util.Map;

public class MemberList implements MemberStore {

    private Map<String, String> userInformation;

    private String userId;
    private String userPassword;


    public MemberList() {
        this.userInformation = new HashMap<>();
    }

    public void setUserId() {

    }

    public void setUserPassword() {

    }

    @Override
    public void setMemberList(String id, String password) {

    }
}

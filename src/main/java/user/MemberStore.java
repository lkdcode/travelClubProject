package user;

import java.util.Map;

public interface MemberStore {
    void addMember(String id, String password);

    Map<String, String> getMemberList();

}

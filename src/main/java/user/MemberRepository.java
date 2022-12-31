package user;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository implements MemberStore {
    private Map<String, String> memberList;

    public MemberRepository() {
        this.memberList = new HashMap<>();
    }


    @Override
    public void addMember(String id, String password) {
        memberList.put(id, password);
    }

    @Override
    public Map<String, String> getMemberList() {
        return memberList;
    }
}

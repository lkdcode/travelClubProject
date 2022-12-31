package user;

public interface AdminService {
    void retrieveAll(MemberStore memberStore);
    void retrieveById(MemberStore memberStore);
    void delete(MemberStore memberStore);
    void modify(MemberStore memberStore);
}

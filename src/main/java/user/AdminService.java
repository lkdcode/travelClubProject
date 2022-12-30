package user;

public interface ClubService {
    void retrieveAll(MemberStore memberStore);
    void retrieveById(MemberStore memberStore);
    void delete(MemberStore memberStore);
    void modify(MemberStore memberStore);
}

package user;

public class UserIdValidate {
    public UserIdValidate(String inputId) {
        userIdValidate(inputId);
    }

    private void userIdValidate(String inputId) {
        if(inputId.matches("^[a-zA-Z0-9]*${4,20}")) {

        }
    }

}

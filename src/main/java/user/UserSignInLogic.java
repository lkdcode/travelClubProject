package user;

import exception.ErrorMessage;

import java.util.Scanner;

public class UserServiceLogic implements UserService {
    private final Scanner scanner = new Scanner(System.in);
    private String userId;
    private String userPassword;

    @Override
    public void signInService() {
        inputId();
        inputPassword();
    }

    @Override
    public void userLoginSurvice() {

    }

    private void loginId() {

    }

    private void loginPassword() {

    }

    private void inputId() {

        do {
            Message.INPUT_ID.getView();
            this.userId = UserInputValidate.getUserInputValidateInstance()
                    .userIdValidate(scanner.nextLine());
            if (memberStore.getMemberList().containsKey(this.userId)) {
                this.userId = "null";
                ErrorMessage.ERROR_INPUT_ID_DUPLICATION.getView();
            }

        } while (this.userId.equals("null"));
    }

    private void inputPassword() {
        do {
            Message.INPUT_PASSWORD.getView();
            this.userPassword = UserInputValidate.getUserInputValidateInstance()
                    .userPasswordValidate(scanner.nextLine());
        } while (this.userPassword.equals("null"));
    }

}

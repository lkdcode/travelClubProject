package user;

import exception.ErrorMessage;

import java.util.Scanner;

public class UserSignInLogic implements UserSignIn {
    private final Scanner scanner = new Scanner(System.in);
    private String userId;
    private String userPassword;


    @Override
    public void signIn(MemberStore memberStore) {
        inputId(memberStore);
        inputPassword();
        memberStore.addMember(userId, userPassword);
    }


    private void inputId(MemberStore memberStore) {

        do {
            Message.INPUT_ID.getView();
            this.userId = UserInputValidate
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
            this.userPassword = UserInputValidate
                    .userPasswordValidate(scanner.nextLine());
        } while (this.userPassword.equals("null"));
    }

}

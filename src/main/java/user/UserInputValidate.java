package user;

import exception.ErrorMessage;

public class UserInputValidate {
    private static final UserInputValidate singleInstance = new UserInputValidate();
    private static final String checkIdPatten = "^[a-zA-Z0-9]{4,20}$";
    private static final String checkPasswordPatten = "^(?=.[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}";

    private UserInputValidate() {
    }

    public static String userIdValidate(String inputId) {
        if (inputId.matches(checkIdPatten)) {
            return inputId;
        }
        ErrorMessage.ERROR_INPUT_ID.getView();
        return "null";
    }

    public static String userPasswordValidate(String inputPassword) {
        if (inputPassword.matches(checkPasswordPatten)) {
            return inputPassword;
        }
        ErrorMessage.ERROR_INPUT_PASSWORD.getView();
        return "null";
    }


}

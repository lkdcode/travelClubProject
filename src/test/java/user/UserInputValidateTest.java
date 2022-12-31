package user;

import org.junit.jupiter.api.Test;

class UserInputValidateTest {


    @Test
    void userIdValidate() {
        String id =
                UserInputValidate
                        .userIdValidate("dkdlel");
        System.out.println(id);
    }

    @Test
    void userPasswordValidate() {
        String password =
                UserInputValidate
                        .userPasswordValidate("ajnjnjn");
        System.out.println(password);
    }
}
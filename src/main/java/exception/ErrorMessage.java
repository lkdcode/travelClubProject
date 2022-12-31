package exception;

public enum ErrorMessage {
    ERROR_MAIN_MENU("[ERROR] 👉 다시 입력해주세요.%n"),
    ERROR_INPUT_ID("[ERROR] 👉 아이디는 4~20 자리의 영문과 숫자만 가능합니다.%n"),
    ERROR_INPUT_ID_DUPLICATION("[ERROR] 👉 중복된 아이디가 존재 합니다.%n"),
    ERROR_INPUT_PASSWORD("[ERROR] 👉 비밀번호는 8~20 자리의 영문과 숫자, 특수문자가 포함되어야 합니다.%n"),
    ERROR_INPUT_BIRTHDAY("[ERROR] 👉 생일의 입력 형식은 yyyy-mm-dd 입니다.%n\tex)2021-12-29%n"),
    ERROR_INPUT_TRAVEL("[ERROR] 👉 아직 준비하지 못 한 여행지입니다. 곧 준비하겠습니다.%n");
    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public void getView() {
        System.out.printf(this.message);
    }
}
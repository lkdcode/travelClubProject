public enum ErrorMessage {
    ERROR_INPUT_ID("아이디를 입력해주세요 : "),
    ERROR_INPUT_PASSWORD("비밀번호를 입력해주세요 : "),
    ERROR_INPUT_BIRTHDAY("생일을 입력해주세요 : "),
    ERROR_INPUT_TRAVEL("여행지를 선택해주세요 : ");

    private String errorMessage;

    ErrorMessage(String view) {
        this.errorMessage = view;
    }

    public void printErrorMessage() {
        System.out.printf(errorMessage);
    }
}

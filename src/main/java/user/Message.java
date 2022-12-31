package user;

public enum Message {
    INPUT_ID("✅ 아이디를 입력해주세요 : "),
    INPUT_PASSWORD("✅ 비밀번호를 입력해주세요 : "),
    INPUT_BIRTHDAY("✅ 생일을 입력해주세요 : "),
    INPUT_TRAVEL("✅ 여행지를 입력해주세요 : ");
    private String message;

    Message(String message) {
        this.message = message;
    }

    public void getView() {
        System.out.println(this.message);
    }
}

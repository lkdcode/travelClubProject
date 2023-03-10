package exception;

public enum ErrorMessage {
    ERROR_MAIN_MENU("[ERROR] π λ€μ μλ ₯ν΄μ£ΌμΈμ.%n"),
    ERROR_INPUT_ID("[ERROR] π μμ΄λλ 4~20 μλ¦¬μ μλ¬Έκ³Ό μ«μλ§ κ°λ₯ν©λλ€.%n"),
    ERROR_INPUT_ID_DUPLICATION("[ERROR] π μ€λ³΅λ μμ΄λκ° μ‘΄μ¬ ν©λλ€.%n"),
    ERROR_INPUT_PASSWORD("[ERROR] π λΉλ°λ²νΈλ 8~20 μλ¦¬μ μλ¬Έκ³Ό μ«μ, νΉμλ¬Έμκ° ν¬ν¨λμ΄μΌ ν©λλ€.%n"),
    ERROR_INPUT_BIRTHDAY("[ERROR] π μμΌμ μλ ₯ νμμ yyyy-mm-dd μλλ€.%n\tex)2021-12-29%n"),
    ERROR_INPUT_TRAVEL("[ERROR] π μμ§ μ€λΉνμ§ λͺ» ν μ¬νμ§μλλ€. κ³§ μ€λΉνκ² μ΅λλ€.%n");
    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public void getView() {
        System.out.printf(this.message);
    }
}
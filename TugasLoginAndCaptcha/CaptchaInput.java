public class CaptchaInput {
    protected String captchaInput;
    protected String userInput;

    public CaptchaInput(String captchaInput, String userInput) {
        this.captchaInput = captchaInput;
        this.userInput = userInput;
    }

    public String getCaptchaInput() {
        return captchaInput;
    }

    public String getuserInput() {
        return userInput;
    }

}

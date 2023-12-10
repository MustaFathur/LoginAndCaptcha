public class Login {

    public static final String username = "Fathur";
    public static final String password = "12345";

    public boolean verifikasi(User user) {
        return username.equals(user.getUsername()) && password.equals(user.getPassword());
    }

}

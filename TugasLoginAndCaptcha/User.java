public class User {
    private String inputUsername;
    private String inputPassword;


    public User(String inputUsername, String inputPassword){
        this.inputUsername = inputUsername;
        this.inputPassword = inputPassword;
    }

    public String getUsername(){
        return inputUsername;
    }

    public String getPassword(){
        return inputPassword;
    }
}

package exceptions;


public class UserNameOrPasswordAreIncorrect extends Exception {

    private String username;
    private String password;

    public UserNameOrPasswordAreIncorrect(String username,String password) {
        super(String.format("Username or password are incorrect!", username,password));
        this.username = username;
        this.password = password;
    }

    public String getUsername() {

        return username;
    }

    public String getPassword() {
        return password;
    }
}
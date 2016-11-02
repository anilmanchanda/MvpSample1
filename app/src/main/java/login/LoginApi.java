package login;

/**
 * Created by anilmanchanda on 11/2/16.
 */

public class LoginApi {

    private String USERNAME = "Anil";
    private String PASSWORD = "123456";

    public boolean authenticate(String username, String password) {
        if (USERNAME.equalsIgnoreCase(username) && PASSWORD.equalsIgnoreCase(password))
            return true;

        return false;
    }
}

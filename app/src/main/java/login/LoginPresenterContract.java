package login;

/**
 * Created by anilmanchanda on 11/2/16.
 */

import android.support.annotation.StringRes;

/**
 * class used to give all the imformation to be used
 * for communication between view, models and events
 * in this app
 */

public class LoginPresenterContract {

    public interface view{
        String getUsername();

        void showErrorWhenUsernameIsEmpty(@StringRes int resId);

        String getPassword();

        void showErrorWhenPasswordIsEmpty(@StringRes int resId);
    }
}

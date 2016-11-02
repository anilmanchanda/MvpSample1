package login;

import com.anil.newmvpsample.R;

/**
 * Created by anilmanchanda on 11/2/16.
 */

public class LoginPresenter {

    private final LoginPresenterContract.view view;
    private final LoginApi api;

    public LoginPresenter(LoginPresenterContract.view loginView, LoginApi loginApi) {
        this.view = loginView;
        this.api = loginApi;
    }

    public void onLoginClicked() {

        String username = view.getUsername();

        if (username.isEmpty()) {
            view.showErrorWhenUsernameIsEmpty(R.string.username_empty);
            return;
        }

        String password = view.getPassword();

        if (password.isEmpty()) {
            view.showErrorWhenPasswordIsEmpty(R.string.password_empty);
            return;
        }
    }
}

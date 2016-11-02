package login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;

import com.anil.newmvpsample.R;

/**
 * Created by anilmanchanda
 * on 11/2/16.
 */

public class LoginActivity extends AppCompatActivity implements LoginPresenterContract.view {

    private Button mBtnLogin;
    private AppCompatEditText mEtUsername, mEtPassword;
    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mEtPassword = (AppCompatEditText) findViewById(R.id.et_password);
        mEtUsername = (AppCompatEditText) findViewById(R.id.et_username);

        mLoginPresenter = new LoginPresenter(this, new LoginApi());

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginPresenter.onLoginClicked();
            }
        });
    }

    // method of view interface in contract.

    @Override
    public String getUsername() {
        return mEtUsername.getText().toString();
    }

    @Override
    public void showErrorWhenUsernameIsEmpty(int resId) {
        mEtUsername.setError(getString(resId));
    }

    @Override
    public String getPassword() {
        return mEtPassword.getText().toString();
    }

    @Override
    public void showErrorWhenPasswordIsEmpty(int resId) {
        mEtPassword.setError(getString(resId));
    }

}

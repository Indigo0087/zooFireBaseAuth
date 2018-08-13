package kz.kna_co.zoo_firebaseauth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RegistrationMainActivity extends AppCompatActivity implements View.OnClickListener{

    private final int SIGN_IN_CODE = 0;
    private final int SIGN_UP_CODE = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSignIn = findViewById(R.id.main_email_sign_in);
        Button btnSignUp = findViewById(R.id.main_email_sign_up);

        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.main_email_sign_in){
            startActivityForResult(new Intent(RegistrationMainActivity.this,
                    EmailPassAuth.class).putExtra(String.valueOf(R.string.CODE), SIGN_IN_CODE), RESULT_OK);
        } else if (id == R.id.main_email_sign_up){
            startActivityForResult(new Intent(RegistrationMainActivity.this,
                    EmailPassAuth.class).putExtra(String.valueOf(R.string.CODE), SIGN_UP_CODE), RESULT_OK);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        data.getExtra
    }
}

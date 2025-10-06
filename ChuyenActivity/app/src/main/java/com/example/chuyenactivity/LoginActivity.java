package com.example.chuyenactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    public static final String EXTRA_USERNAME = "EXTRA_USERNAME";
    public static final String EXTRA_PASSWORD = "EXTRA_PASSWORD";

    EditText edtUser, edtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = edtUser.getText().toString().trim();
                String pass = edtPass.getText().toString().trim();

                if (user.isEmpty()) {
                    edtUser.setError("Nhập username");
                    return;
                }

                // Chuyển sang profile và đưa dữ liệu user/password
                Intent i = new Intent(LoginActivity.this, ProfileActivity.class);
                i.putExtra(EXTRA_USERNAME, user);
                i.putExtra(EXTRA_PASSWORD, pass);
                startActivity(i);

                // finish();
            }
        });
    }
}

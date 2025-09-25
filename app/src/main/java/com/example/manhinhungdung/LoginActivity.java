package com.example.manhinhungdung;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText edtEmailLogin, edtPasswordLogin;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmailLogin = findViewById(R.id.edtEmailLogin);
        edtPasswordLogin = findViewById(R.id.edtPasswordLogin);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String email = edtEmailLogin.getText().toString().trim();
            String password = edtPasswordLogin.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập email và mật khẩu", Toast.LENGTH_SHORT).show();
                return;
            }

            // Lấy dữ liệu từ SharedPreferences
            SharedPreferences sharedPref = getSharedPreferences("UserPrefs", MODE_PRIVATE);
            String savedEmail = sharedPref.getString("email", "");
            String savedPassword = sharedPref.getString("password", "");

            // Kiểm tra đăng nhập
            if (email.equals(savedEmail) && password.equals(savedPassword)) {
                Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                // Chuyển sang PaymentActivity hoặc MainActivity
                Intent intent = new Intent(LoginActivity.this, PaymentActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Email hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

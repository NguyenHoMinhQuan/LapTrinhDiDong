package com.example.manhinhungdung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText edtFullName, edtRegUsername, edtEmail, edtRegPassword, edtConfirmPassword;
    Button btnRegister, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtFullName = findViewById(R.id.edtFullName);
        edtRegUsername = findViewById(R.id.edtRegUsername);
        edtEmail = findViewById(R.id.edtEmail);
        edtRegPassword = findViewById(R.id.edtRegPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);
        btnCancel = findViewById(R.id.btnCancel);

        btnCancel.setOnClickListener(v -> finish());
        btnRegister.setOnClickListener(v -> {
            // Xử lý đăng ký (tạm thời chỉ Toast)
        });
    }
}

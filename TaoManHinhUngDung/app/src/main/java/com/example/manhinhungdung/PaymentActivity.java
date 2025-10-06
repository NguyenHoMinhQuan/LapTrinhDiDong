package com.example.manhinhungdung;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {
    EditText edtCardNumber, edtExpiryDate, edtCvv;
    Button btnPay, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        edtCardNumber = findViewById(R.id.edtCardNumber);
        edtExpiryDate = findViewById(R.id.edtExpiryDate);
        edtCvv = findViewById(R.id.edtCvv);
        btnPay = findViewById(R.id.btnPay);
        btnCancel = findViewById(R.id.btnCancel);

        btnCancel.setOnClickListener(v -> finish());

        btnPay.setOnClickListener(v -> {
            String cardNumber = edtCardNumber.getText().toString().trim();
            String expiryDate = edtExpiryDate.getText().toString().trim();
            String cvv = edtCvv.getText().toString().trim();

            if (cardNumber.isEmpty() || expiryDate.isEmpty() || cvv.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Thanh toán thành công!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}

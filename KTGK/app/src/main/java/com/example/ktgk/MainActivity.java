package com.example.ktgk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtHoTen, edtDiem;
    Button btnKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 🔹 Ánh xạ đúng với ID trong activity_main.xml
        edtHoTen = findViewById(R.id.edtHoTen);
        edtDiem = findViewById(R.id.edtDiem);
        btnKetQua = findViewById(R.id.btnKetQua);

        btnKetQua.setOnClickListener(v -> {
            String name = edtHoTen.getText().toString().trim();
            String scoreStr = edtDiem.getText().toString().trim();

            if (name.isEmpty() || scoreStr.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
                return;
            }

            try {
                double score = Double.parseDouble(scoreStr);
                if (score < 0 || score > 10) {
                    Toast.makeText(this, "Điểm phải từ 0 đến 10!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // 🔹 Gửi dữ liệu sang ResultActivity
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("score", score);
                startActivity(intent);

            } catch (NumberFormatException e) {
                Toast.makeText(this, "Điểm phải là số!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

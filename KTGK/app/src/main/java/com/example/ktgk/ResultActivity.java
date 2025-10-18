package com.example.ktgk;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tvResult, tvDetail;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResult = findViewById(R.id.tvResult);
        tvDetail = findViewById(R.id.tvDetail);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        double score = intent.getDoubleExtra("score", 0);

        String rank;
        if (score >= 8) rank = "Giỏi";
        else if (score >= 6.5) rank = "Khá";
        else if (score >= 5) rank = "Trung bình";
        else rank = "Yếu";

        tvDetail.setText("Sinh viên: " + name + "\nĐiểm trung bình: " + score + "\nXếp loại: " + rank);

        btnBack.setOnClickListener(v -> {
            Intent backIntent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(backIntent);
            finish();
        });
    }
}
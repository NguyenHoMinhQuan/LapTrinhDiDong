package com.example.chuyenactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class ProfileActivity extends AppCompatActivity {

    TextView tvName, tvAvatar, tvEmail, tvPhone, tvSkype, tvWeb, tvFriendsNum, tvFollowersNum;
    ImageButton btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        tvName = findViewById(R.id.tvName);
        tvAvatar = findViewById(R.id.tvAvatar);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);
        tvSkype = findViewById(R.id.tvSkype);
        tvWeb = findViewById(R.id.tvWeb);
        tvFriendsNum = findViewById(R.id.tvFriendsNum);
        tvFollowersNum = findViewById(R.id.tvFollowersNum);

        btnSetting = findViewById(R.id.btnSetting);

        // Lấy dữ liệu từ Intent
        Intent i = getIntent();
        String user = i.getStringExtra(LoginActivity.EXTRA_USERNAME);
        String pass = i.getStringExtra(LoginActivity.EXTRA_PASSWORD);

        if (user == null) user = "Unknown";
        if (pass == null) pass = "";

        // Hiển thị thông tin
        tvName.setText(user);
        tvAvatar.setText(user.length()>0 ? user.substring(0,1).toUpperCase() : "A");
        tvEmail.setText("Email: " + user + "@gmail.com");
        tvPhone.setText("Phone: +2311 505 3122 134");
        tvSkype.setText("Skype: " + user + "134");
        tvWeb.setText("Web: www." + user.toLowerCase() + ".com");


        tvFriendsNum.setText("125");
        tvFollowersNum.setText("250");

        // Nút setting: về lại Login
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }
}

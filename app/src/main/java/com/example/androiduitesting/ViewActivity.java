package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {
    public static final String city_name_extra = "extra_city_name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        TextView cityNameView = findViewById(R.id.text_city_name);
        Button backBtn = findViewById(R.id.button_back);

        String city = getIntent().getStringExtra(city_name_extra);
        cityNameView.setText(city != null ? city : "");

        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}

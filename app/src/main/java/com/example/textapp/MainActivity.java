package com.example.textapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Creating layout dynamically for simplicity
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#121212"));

        TextView textView = new TextView(this);
        textView.setText("أهلاً بك يا مصطفى - تطبيق عرض النص");
        textView.setTextSize(22);
        textView.setTextColor(Color.parseColor("#00E676"));
        textView.setGravity(Gravity.CENTER);

        layout.addView(textView);
        setContentView(layout);
    }
}

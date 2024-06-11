package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HealthArticalDetailsActivity extends AppCompatActivity {
    TextView tv1;
    ImageView img;
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_health_artical_details);
        btnBack=findViewById(R.id.buttonHADBack);
        img=findViewById(R.id.imageHAD);
        tv1=findViewById(R.id.textViewHADTitle);

        Intent intent=getIntent();
        tv1.setText(intent.getStringExtra("text1"));

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            int resID=bundle.getInt("text2");
            img.setImageResource(resID);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HealthArticalDetailsActivity.this, HealthArticalActivity.class));

            }
        });


    }
}
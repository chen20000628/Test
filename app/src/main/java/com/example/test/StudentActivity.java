package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {
    private TextView Title;
    private ImageView btn_class1;
    private ImageView use;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Title = findViewById(R.id.Title);
        Intent intent = getIntent();
        String name = intent.getStringExtra("chen");
        if (name != null){
            Title.setText("欢迎"+name+"来到您的空间");
        }

        btn_class1 = findViewById(R.id.btn_class);
        use = findViewById(R.id.use);

        btn_class1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentActivity.this,ClassActivity.class);
                startActivity(intent);
            }
        });
    }

}


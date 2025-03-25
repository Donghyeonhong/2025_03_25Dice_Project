package com.example.dice_project;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;

    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageView1 = findViewById(R.id.Dice1);
        imageView2 = findViewById(R.id.Dice2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int r1 = random.nextInt(6);
                int r2 = random.nextInt(6);

                if (r1 == 0){
                    imageView1.setImageResource(R.drawable.d1);
                } else if (r1 == 1) {
                    imageView1.setImageResource(R.drawable.d2);
                } else if (r1 == 2) {
                    imageView1.setImageResource(R.drawable.d3);
                } else if (r1 == 3) {
                    imageView1.setImageResource(R.drawable.d4);
                } else if (r1 == 4) {
                    imageView1.setImageResource(R.drawable.d5);
                } else if (r1 == 5) {
                    imageView1.setImageResource(R.drawable.d6);
                }

                if (r2 == 0){
                    imageView2.setImageResource(R.drawable.d1);
                } else if (r2 == 1) {
                    imageView2.setImageResource(R.drawable.d2);
                } else if (r2 == 2) {
                    imageView2.setImageResource(R.drawable.d3);
                } else if (r2 == 3) {
                    imageView2.setImageResource(R.drawable.d4);
                } else if (r2 == 4) {
                    imageView2.setImageResource(R.drawable.d5);
                } else if (r2 == 5) {
                    imageView2.setImageResource(R.drawable.d6);
                }

            }

        });
    }
}
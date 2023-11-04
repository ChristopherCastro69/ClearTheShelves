package com.example.cleartheshelves;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cleartheshelves.Miscellaneous.OptionsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView textView3 = findViewById(R.id.textView3);
//        textView3.setVisibility(View.VISIBLE);
//        textView3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Start the OptionsActivity to display the list of options
//                Intent intent = new Intent(MainActivity.this, OptionsActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}

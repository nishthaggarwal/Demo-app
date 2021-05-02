package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Welcome Nishtha",Toast.LENGTH_SHORT).show();
    }

    public void ll(View view) {
        Intent intent = new Intent(MainActivity.this, LinearActivity.class);
        startActivity(intent);
    }
    public void rl(View view) {
        Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
        startActivity(intent);
    }
    public void gl(View view) {
        Intent intent = new Intent(MainActivity.this, GridActivity.class);
        startActivity(intent);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
    }

    public void onRadioButtonClicked(View view) {
    }
}
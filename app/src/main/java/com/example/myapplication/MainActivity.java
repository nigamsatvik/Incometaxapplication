package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed=(EditText)findViewById(R.id.editText);
        final Double amount=Double.parseDouble(ed.getText().toString());
        Spinner spin=(Spinner)findViewById(R.id.spinner);
        String text=spin.getSelectedItem().toString();
        final Double rate=Double.parseDouble(text);
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res=(rate/100)*amount;
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("result",res);
                startActivity(intent);
            }
        });
    }
}

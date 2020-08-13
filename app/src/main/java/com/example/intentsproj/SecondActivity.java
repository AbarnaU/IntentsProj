package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String msg1 = intent.getStringExtra(FirstActivity.Extra_Msg1);
        String msg2 = intent.getStringExtra(FirstActivity.Extra_Msg2);

        TextView number1 = (TextView) findViewById(R.id.number1);
        number1.setText(msg1);

        TextView number2 = (TextView) findViewById(R.id.number2);
        number2.setText(msg2);
    }

    public void add(View view){
        EditText text1 = (EditText) findViewById(R.id.number1);
        EditText text2 = (EditText) findViewById(R.id.number2);

        int x = Integer.parseInt(text1.getText().toString());
        int y = Integer.parseInt(text2.getText().toString());

        int add = x + y;

        TextView ans = (TextView) findViewById(R.id.answer);
        ans.setText(x + " + " + y + " = " + add );
    }

    public void sub(View view){
        EditText text1 = (EditText) findViewById(R.id.number1);
        EditText text2 = (EditText) findViewById(R.id.number2);

        int x = Integer.parseInt(text1.getText().toString());
        int y = Integer.parseInt(text2.getText().toString());

        int sub = x - y;

        TextView ans = (TextView) findViewById(R.id.answer);
        ans.setText(x + " - " + y + " = " + sub );
    }

    public void multiplication (View view){
        EditText text1 = (EditText) findViewById(R.id.number1);
        EditText text2 = (EditText) findViewById(R.id.number2);

        int x = Integer.parseInt(text1.getText().toString());
        int y = Integer.parseInt(text2.getText().toString());

        int multi = x * y;

        TextView ans = (TextView) findViewById(R.id.answer);
        ans.setText(x + " * " + y + " = " + multi );
    }

    public void division (View view){
        EditText text1 = (EditText) findViewById(R.id.number1);
        EditText text2 = (EditText) findViewById(R.id.number2);

        int x = Integer.parseInt(text1.getText().toString());
        int y = Integer.parseInt(text2.getText().toString());

        int div = x / y;

        TextView ans = (TextView) findViewById(R.id.answer);
        ans.setText(x + " - " + y + " = " + div );
    }
}
package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public static final String Extra_Msg1 = "m1";
    public static final String Extra_Msg2 = "m2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void customToast(View view){
        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        //setting the view of custom toastlayout
        toast.show();
    }

    public void SentMsg(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        EditText num1 = (EditText) findViewById(R.id.editText1);
        String msg1 = num1.getText().toString();

        EditText num2 = (EditText) findViewById(R.id.editText2);
        String msg2 = num2.getText().toString();

        intent.putExtra(Extra_Msg1, msg1);
        intent.putExtra(Extra_Msg2, msg2);

        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence toastMsg = "Sending Message";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, toastMsg, duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);

    }
}
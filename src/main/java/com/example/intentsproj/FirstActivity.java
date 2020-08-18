package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private Button button;
    public static final String EXTRA_NUMBER1 = "com.example.intentsProj.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 = "com.example.intentsProj.EXTRA_NUMBER2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnOk);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                OK();

                //Toast message method 01
                //Toast.makeText(getApplicationContext(),R.string.toast,Toast.LENGTH_LONG).show();

                //Toast message method 02
                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button"; //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
            }
        });
    }

    public void OK(){
        EditText edittxt1 = (EditText) findViewById(R.id.editText1);
        EditText edittxt2 = (EditText) findViewById(R.id.editText2);
        int num1 = Integer.parseInt(edittxt1.getText().toString());
        int num2 = Integer.parseInt(edittxt2.getText().toString());

        Intent intent  = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_NUMBER1, num1);
        intent.putExtra(EXTRA_NUMBER2, num2);
        startActivity(intent);
        finish();
    }
}
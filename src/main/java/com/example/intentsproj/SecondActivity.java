package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        final int num1 = intent.getIntExtra(FirstActivity.EXTRA_NUMBER1,0);
        final int num2 = intent.getIntExtra(FirstActivity.EXTRA_NUMBER2,0);

        TextView  txtView1 = (TextView) findViewById(R.id.Input1);
        TextView  txtView2 = (TextView) findViewById(R.id.Input2);

        txtView1.setText("" + num1);
        txtView2.setText("" + num2);

        Button add = (Button) findViewById(R.id.btnAdd);
        Button sub = (Button) findViewById(R.id.btnSub);
        Button mul = (Button) findViewById(R.id.btnMul);
        Button div = (Button) findViewById(R.id.btnDiv);
        final TextView ans = (TextView) findViewById(R.id.calc);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int addAns = num1 + num2;
                ans.setText("" + num1 + "+" + "" + num2 + "=" + String.valueOf(addAns));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int subAns = num1 - num2;
                ans.setText("" + num1 + "-" + num2 + "=" + String.valueOf(subAns));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mulAns = num1 * num2;
                ans.setText("" + num1 + "*" + num2 + "=" + String.valueOf(mulAns));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int divAns = num1 / num2;
                ans.setText("" + num1 +  "/" + num2 + "=" + String.valueOf(divAns));
            }
        });
    }
}
package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float num1;
    float num2;
    float res;

    TextView txtNum1;
    TextView txtNum2;
    TextView txtRes;
    //Addition
    public void btnAdd_Clicked(View view){
        try {
            num1 = Float.parseFloat(txtNum1.getText().toString());
            num2 = Float.parseFloat(txtNum2.getText().toString());
            res = num1+num2;
            txtRes.setText(Float.toString(res));
        }
        catch (Exception e) {
            Toast.makeText(this, "Please Enter the Number", Toast.LENGTH_SHORT).show();
        }
    }

    //Substraction
    public void btnSub_Clicked(View view){
        try {
            num1 = Float.parseFloat(txtNum1.getText().toString());
            num2 = Float.parseFloat(txtNum2.getText().toString());
            res = num1 - num2;
            txtRes.setText(Float.toString(res));
        }
        catch (Exception e){
            Toast.makeText(this, "Please Enter the Number", Toast.LENGTH_SHORT).show();
        }
    }

    //Multiplication
    public void btnMul_Clicked(View view){
        try {
            num1 = Float.parseFloat(txtNum1.getText().toString());
            num2 = Float.parseFloat(txtNum2.getText().toString());
            res = num1 * num2;
            txtRes.setText(Float.toString(res));
        }
        catch(Exception e){
            Toast.makeText(this, "Please Enter the Number", Toast.LENGTH_SHORT).show();
        }
    }

    //Division
    public void btnDiv_Clicked(View view){
        try {
            num1 = Float.parseFloat(txtNum1.getText().toString());
            num2 = Float.parseFloat(txtNum2.getText().toString());
            res = num1 / num2;
            txtRes.setText(Float.toString(res));
        }
        catch(Exception e){
            Toast.makeText(this, "Please Enter the Number", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtRes = findViewById(R.id.txtRes);
    }
}
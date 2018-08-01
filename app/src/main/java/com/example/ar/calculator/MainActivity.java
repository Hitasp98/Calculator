package com.example.ar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview1;
    TextView textview2;
    int sum = 0;
    long l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = (TextView) findViewById(R.id.t1);
        textview2 = (TextView) findViewById(R.id.t2);

    }

    public void one(View V) {
    long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");
        textview1.append(1 + "");
    }

    public void two(View V) {
        long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");
        textview1.append(2 + "");
    }

    public void three(View V) {
        long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");
        textview1.append(3 + "");
    }

    public void fur(View V) {
        long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");
        textview1.append(4 + "");
    }

    public void five(View V) {
        long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");
        textview1.append(5 + "");
    }

    public void six(View V) {
        long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");
        textview1.append(6 + "");
    }

    public void seven(View V) {
        long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");
        textview1.append(7 + "");
    }

    public void eiate(View V) {
        long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");
        textview1.append(8 + "");
    }

    public void nine(View V) {
        long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");
        textview1.append(9 + "");
    }

    public void ziro(View V) {
        long f = Long.parseLong(textview1.getText().toString());
        if (f == 0)
            textview1.setText("");

        textview1.append(0 + "");
    }

    public void CE(View V) {
        textview1.setText("0");
        textview2.setText("");
    }

    public void Plus(View V) {
        l =Long.parseLong(textview1.getText().toString());
        textview1.setText("0");
        String s = String.valueOf(l);
        textview2.setText(s);
        sum = 1;
    }

    public void mines(View V) {
        l =Long.parseLong(textview1.getText().toString());
        textview1.setText("0");
        String s = String.valueOf(l);
        textview2.setText(s);
        sum = 2;
    }

    public void Mult(View V) {
        l =Long.parseLong(textview1.getText().toString());
        textview1.setText("0");
        String s = String.valueOf(l);
        textview2.setText(s);
        sum = 3;
    }

    public void Division(View V) {
        l =Long.parseLong(textview1.getText().toString());
        textview1.setText("0");
        String s = String.valueOf(l);
        textview2.setText(s);
        sum = 4;
    }
 /*  // public void p1(View V)
   // {
 //       textview2.setText("(");
//        sum = 5;
    }
    public void p2(View V)
    {

        textview2.setText(")");
        sum = 6;
    }*/
    public void equls(View V) {
        long q = Integer.parseInt(textview1.getText().toString());
        if (q == 0)
        {
            String s = String.valueOf(l);
            if(sum==1)
            {textview2.setText(s + "+" + 0);

                String sf = String.valueOf(l + 0);
                textview1.setText(sf); }
            else if(sum==2)
            {
                textview2.setText(s + "-" +0);
                String sf = String.valueOf(l - 0);
                textview1.setText(sf);
            }
           else if(sum==3)
            {
                textview2.setText(s + "×" + 0);
                String sf = String.valueOf(l * 0);
                textview1.setText(sf);
            }
            else if(sum==4)
            {
                textview2.setText(s + "÷" + 0);
                String sf = String.valueOf(l /0);
                textview1.setText(sf);
            }
        }
    //textview1.setText("not");
        else if (sum == 1) {
            String s = String.valueOf(l);
            String ss = String.valueOf(q);
            textview2.setText(s + "+" + ss);
            String sf = String.valueOf(l + q);
            textview1.setText(sf);
        }
        else if (sum == 2) {
            String s = String.valueOf(l);
            String ss = String.valueOf(q);

            textview2.setText(s + "-" + ss);
            String sf = String.valueOf(l - q);
            textview1.setText(sf);
        }
        else if (sum == 3) {
            String s = String.valueOf(l);
            String ss = String.valueOf(q);

            textview2.setText(s + "×" + ss);
            String sf = String.valueOf(l * q);
            textview1.setText(sf);
        }
        else if (sum == 4) {
            String s = String.valueOf(l);
            String ss = String.valueOf(q);

            textview2.setText(s + "÷" + ss);
            String sf = String.valueOf(l / q);
            textview1.setText(sf);
        }

    }
 //   public  void no(View V)
  //  {
     //   textview1.append(".");
   // }
}

package com.example.tcalculator;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.tcalculator.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    double in1,in2;
    boolean add,sub,rem,dec,div,mul;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, c1, c2, c3, c4, c5, c6, c7, d5, d6, d7, d8;
    TextView n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        c1 = (Button) findViewById(R.id.c1);
        c2 = (Button) findViewById(R.id.c2);
        c3 = (Button) findViewById(R.id.c3);
        c4 = (Button) findViewById(R.id.c4);
        c5 = (Button) findViewById(R.id.c5);
        c6 = (Button) findViewById(R.id.c6);
        c7 = (Button) findViewById(R.id.c7);
        d5 = (Button) findViewById(R.id.d5);
        d6 = (Button) findViewById(R.id.d6);
        d7 = (Button) findViewById(R.id.d7);
        d8 = (Button) findViewById(R.id.d8);
        n = (TextView) findViewById(R.id.n);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n.getText().length() != 0) {
                    in1 = Float.parseFloat(n.getText() + "");
                    rem = true;
                    dec = false;
                    n.setText(null);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText("");
                in1 = 0.0;
                in2 = 0.0;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "7");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "8");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "9");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n.getText().length() != 0) {
                    in1 = Float.parseFloat(n.getText() + "");
                    div = true;
                    dec = false;
                    n.setText(null);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "4");
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "5");
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "6");
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n.getText().length() != 0) {
                    in1 = Float.parseFloat(n.getText() + "");
                    mul = true;
                    dec = false;
                    n.setText(null);
                }
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "1");
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "2");
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "3");
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n.getText().length() != 0) {
                    in1 = Float.parseFloat(n.getText() + "");
                    sub = true;
                    dec = false;
                    n.setText(null);
                }
            }
        });
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText() + "0");
            }
        });
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dec) {
                    //do nothing or you can show the error
                } else {
                    n.setText(n.getText() + ".");
                    dec = true;
                }

            }
        });
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add|| sub || mul|| div || rem) {
                    in2 = Float.parseFloat(n.getText() + "");
                }

                if (add) {

                    n.setText(in1 + in2 + "");
                    add = false;
                }

                if (sub) {

                    n.setText(in1 - in2 + "");
                    sub = false;
                }

                if (mul) {
                    n.setText(in1 * in2 + "");
                    mul = false;
                }

                if (div) {
                    n.setText(in1 / in2 + "");
                    div = false;
                }
                if (rem) {
                    n.setText(in1 % in2 + "");
                    rem = false;
                }
            }
        });

        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n.getText().length() != 0) {
                    in1 = Float.parseFloat(n.getText() + "");
                    add = true;
                    dec = false;
                    n.setText(null);
                }
            }
        });
    }
}

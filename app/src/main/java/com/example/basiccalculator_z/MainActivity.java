package com.example.basiccalculator_z;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Addition, Subtraction, Multiplication, Division;
    private EditText First, Second;
    private TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        Addition = (Button)findViewById(R.id.button);
        Subtraction = (Button)findViewById(R.id.button2);
        Multiplication = (Button)findViewById(R.id.button3);
        Division = (Button)findViewById(R.id.button4);
        First = (EditText)findViewById(R.id.editText);
        Second = (EditText)findViewById(R.id.editText2);
        Result = (TextView) findViewById(R.id.textViewResult);

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateButton(30);
                if (First.getText().toString().equals("") || Second.getText().toString().equals("")) {
                    if (First.getText().toString().equals("") && Second.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Please enter 2 numbers", Toast.LENGTH_SHORT).show();
                    } else {
                        if (First.getText().toString().equals("")) {
                            Toast.makeText(MainActivity.this, "Please enter the first number", Toast.LENGTH_SHORT).show();
                        }
                        if (Second.getText().toString().equals("")) {
                            Toast.makeText(MainActivity.this, "Please enter the second number", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    double firstNum = Double.valueOf(First.getText().toString());
                    double secondNum = Double.valueOf(Second.getText().toString());
                    double resultNum = firstNum + secondNum;
                    Result.setText(String.valueOf(resultNum));
                }
            }
        });

        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateButton(30);
                if (First.getText().toString().equals("") || Second.getText().toString().equals("")) {
                    if (First.getText().toString().equals("") && Second.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Please enter 2 numbers", Toast.LENGTH_SHORT).show();
                    } else {
                        if (First.getText().toString().equals("")) {
                            Toast.makeText(MainActivity.this, "Please enter the first number", Toast.LENGTH_SHORT).show();
                        }
                        if (Second.getText().toString().equals("")) {
                            Toast.makeText(MainActivity.this, "Please enter the second number", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    double firstNum = Double.valueOf(First.getText().toString());
                    double secondNum = Double.valueOf(Second.getText().toString());
                    double resultNum = firstNum - secondNum;
                    Result.setText(String.valueOf(resultNum));
                }
            }
        });

        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateButton(30);
                if (First.getText().toString().equals("") || Second.getText().toString().equals("")) {
                    if (First.getText().toString().equals("") && Second.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Please enter 2 numbers", Toast.LENGTH_SHORT).show();
                    } else {
                        if (First.getText().toString().equals("")) {
                            Toast.makeText(MainActivity.this, "Please enter the first number", Toast.LENGTH_SHORT).show();
                        }
                        if (Second.getText().toString().equals("")) {
                            Toast.makeText(MainActivity.this, "Please enter the second number", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    double firstNum = Double.valueOf(First.getText().toString());
                    double secondNum = Double.valueOf(Second.getText().toString());
                    double resultNum = firstNum * secondNum;
                    Result.setText(String.valueOf(resultNum));
                }
            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateButton(30);
                if (First.getText().toString().equals("") || Second.getText().toString().equals("")) {
                    if (First.getText().toString().equals("") && Second.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Please enter 2 numbers", Toast.LENGTH_SHORT).show();
                    } else {
                        if (First.getText().toString().equals("")) {
                            Toast.makeText(MainActivity.this, "Please enter the first number", Toast.LENGTH_SHORT).show();
                        }
                        if (Second.getText().toString().equals("")) {
                            Toast.makeText(MainActivity.this, "Please enter the second number", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    double firstNum = Double.valueOf(First.getText().toString());
                    double secondNum = Double.valueOf(Second.getText().toString());
                    double resultNum = firstNum / secondNum;
                    Result.setText(String.valueOf(resultNum));
                }
            }
        });

    }

    private void vibrateButton (long ms) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(ms, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(ms);
        }
    }

}

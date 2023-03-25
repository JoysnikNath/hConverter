package com.jsus.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.Format;

public class MainActivity extends AppCompatActivity {
    int inches;
    double meter;
    private EditText inchesEdit;
    private EditText resultText;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateInchestoMeters();
            }
        });
    }

    private void calculateInchestoMeters() {
        if(inchesEdit.getText().toString().isEmpty())
            Toast.makeText(MainActivity.this, "INPUT NOT GIVEN", Toast.LENGTH_SHORT).show();
        else{
            inches = Integer.parseInt(inchesEdit.getText().toString());
            meter = inches*0.0254;
            DecimalFormat mydecimal = new DecimalFormat("0.00");
            String meterstr = mydecimal.format(meter);
            resultText.setText(meterstr);
//                    inchesEdit.setText("3434");
        }
    }

    private void findViews() {
        inchesEdit = findViewById(R.id.editInches);
        resultText = findViewById(R.id.resultText);
        calculateButton = findViewById(R.id.calculateButton);
        }
}

package com.daniel.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.inputValue);
        textView1 = (TextView)findViewById(R.id.textView1);


    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                RadioButton celsiusButton = (RadioButton)findViewById(R.id.radio0);
                RadioButton fahrenheitButton = (RadioButton)findViewById(R.id.radio1);
                if (text.getText().length() == 0){
                    Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if(celsiusButton.isChecked()){
                    textView1.setText(String.valueOf(ConvertUtil.convertCelsiusToFahrenheit(inputValue)));
                    fahrenheitButton.setChecked(true);
                    celsiusButton.setChecked(false);
                }else{
                    textView1.setText(String.valueOf(ConvertUtil.convertFahrenheitToCelsius(inputValue)));
                    fahrenheitButton.setChecked(false);
                    celsiusButton.setChecked(true);
                }
                break;
        }
    }
}

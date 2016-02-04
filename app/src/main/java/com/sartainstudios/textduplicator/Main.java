package com.sartainstudios.textduplicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    String textToDuplicate;
    int numberToMultiplyBy;
    String numberHolder;
    TextView resultsDisplay;
    Button calculate;
    EditText mainInput;
    EditText multiplier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineValues();
        click();
    }

    public void click() {
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToDuplicate = mainInput.getText().toString();
                numberHolder = multiplier.getText().toString();
                numberToMultiplyBy = Integer.parseInt(numberHolder);
                calculating();
                settingText();
            }
        });

    }

    public void calculating() {
        int i = 1;
        while (i < numberToMultiplyBy){
            textToDuplicate+= textToDuplicate;
            i++;
        }

    }

    public void settingText() {
        resultsDisplay.setText(textToDuplicate);
    }

    public void defineValues() {
        mainInput = (EditText) findViewById(R.id.text_to_duplicate_edit_text);
        multiplier = (EditText) findViewById(R.id.duplication_number_edit_text);
        calculate = (Button) findViewById(R.id.duplicate_button);
        resultsDisplay = (TextView) findViewById(R.id.results_printed);
    }
}

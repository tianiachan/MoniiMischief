package ravnia.moniimischief;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class main_screen extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    EditText original;
    TextView  anticipatetxt, orgText, conText, resText, converted;
    Spinner currencySelectO, currencySelectC;
    double org, con, res;

    //create screen
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        //initializing text
        original = findViewById(R.id.original);
        converted = findViewById(R.id.converted);
        //originalLabeltxt = findViewById(R.id.originalLabel);
        //convertLabeltxt = findViewById(R.id.convertedLabel);
        orgText = findViewById(R.id.originalText);
        conText = findViewById(R.id.convertedText);
        resText = findViewById(R.id.resultText);


        anticipatetxt = findViewById(R.id.disclaimer);
        currencySelectO = findViewById(R.id.originalSpinner);
        currencySelectC = findViewById(R.id.convertedSpinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.currencyArray, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        currencySelectO.setAdapter(adapter);
        currencySelectO.setOnItemSelectedListener(this);
        currencySelectC.setAdapter(adapter);
        currencySelectC.setOnItemSelectedListener(this);

    }

    //if no currency selected, display toast saying nothing selected
    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "Nothing selected.",
                Toast.LENGTH_SHORT);
        toast.show();
    }


    //if currency is selected, display toast saying what was selected
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        /**
        Toast toast = Toast.makeText(getApplicationContext(), "Currency Selected: " +
                String.valueOf(currencySelectO.getSelectedItem()),Toast.LENGTH_SHORT);
        toast.show();
        Toast toast2 = Toast.makeText(getApplicationContext(), "Currency Selected: " +
                String.valueOf(currencySelectC.getSelectedItem()), Toast.LENGTH_SHORT);
        toast2.show(); **/

        orgText.setText(currencySelectO.getSelectedItem().toString());
        conText.setText(currencySelectC.getSelectedItem().toString());
    }

    public void buttonSelected (View view)
    {
        //get numerical value of currency
        try
        {
            org = Double.parseDouble(original.getText().toString());
        }
        catch (Exception e)//otherwise put 0 since is empty
        {
            org = 0.00;
            Toast error = Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT);
            error.show();
        }

        //con = Double.parseDouble(converted.getText().toString());

        //get currency type
        String orgStr = orgText.getText().toString();
        String conStr = conText.getText().toString();

        if (orgStr.equals("USD"))
        {
            if (conStr.equals("EUR"))
                res = org * 0.87;
            else if(conStr.equals("JPY"))
                res = org * 112.49;
            else if(conStr.equals("GBP"))
                res = org * 0.77;
            else if(conStr.equals("AUD"))
                res = org * 1.4;
            else if (conStr.equals("CAD"))
                res = org * 1.31;
            else if (conStr.equals("CHF"))
                res = org;
            else if (conStr.equals("CNY"))
                res = org * 6.93;
            else if (conStr.equals("SEK"))
                res = org * 9.03;
            else if (conStr.equals("NZD"))
                res = org * 1.52;
            else if (conStr.equals("MXN"))
                res = org * 19.10;
            else if (conStr.equals("NOK"))
                res = org * 8.26;
            else if (conStr.equals("KRW"))
                res = org * 1131.48;
            else if (conStr.equals("TRY"))
                res = org * 5.61;
            else if (conStr.equals("RUB"))
                res = org * 65.75;
            else if (conStr.equals("INR"))
                res = org * 73.43;
            else if (conStr.equals("BRL"))
                res = org * 3.72;
            else if (conStr.equals("ZAR"))
                res = org * 14.40;
            else if (conStr.equals("HKD"))
                res = org * 7.84;
            else if(conStr.equals("SGD"))
                res = org * 1.38;
            else if (conStr.equals ("USD"))
                res = org;
        }
        else if (orgStr.equals("EUR"))
        {
            if (conStr.equals("EUR"))
                res = org;
            else if(conStr.equals("JPY"))
                res = org * 129.22;
            else if(conStr.equals("GBP"))
                res = org * 0.87;
            else if(conStr.equals("AUD"))
                res = org * 1.57;
            else if (conStr.equals("CAD"))
                res = org * 1.49;
            else if (conStr.equals("CHF"))
                res = org * 1.14;
            else if (conStr.equals("CNY"))
                res = org * 7.88;
            else if (conStr.equals("SEK"))
                res = org * 10.25;
            else if (conStr.equals("NZD"))
                res = org * 1.68;
            else if (conStr.equals("MXN"))
                res = org * 22.88;
            else if (conStr.equals("NOK"))
                res = org * 9.52;
            else if (conStr.equals("KRW"))
                res = org * 1278.15;
            else if (conStr.equals("TRY"))
                res = org * 6.21;
            else if (conStr.equals("RUB"))
                res = org * 75.93;
            else if (conStr.equals("INR"))
                res = org * 82.54;
            else if (conStr.equals("BRL"))
                res = org * 4.27;
            else if (conStr.equals("ZAR"))
                res = org * 16.06;
            else if (conStr.equals("HKD"))
                res = org * 8.88;
            else if(conStr.equals("SGD"))
                res = org * 1.56;
            else if (conStr.equals ("USD"))
                res = org * 1.13;

        }
        else if (orgStr.equals("JPY"))
        {
            if (conStr.equals("EUR"))
                res = org;
            else if(conStr.equals("JPY"))
                res = org;
            else if(conStr.equals("GBP"))
                res = org;
            else if(conStr.equals("AUD"))
                res = org;
            else if (conStr.equals("CAD"))
                res = org;
            else if (conStr.equals("CHF"))
                res = org;
            else if (conStr.equals("CNY"))
                res = org * 0.06;
            else if (conStr.equals("SEK"))
                res = org * 0.08;
            else if (conStr.equals("NZD"))
                res = org * 0.01;
            else if (conStr.equals("MXN"))
                res = org * 0.18;
            else if (conStr.equals("NOK"))
                res = org * 0.07;
            else if (conStr.equals("KRW"))
                res = org * 9.89;
            else if (conStr.equals("TRY"))
                res = org * 0.05;
            else if (conStr.equals("RUB"))
                res = org * 0.59;
            else if (conStr.equals("INR"))
                res = org * 0.64;
            else if (conStr.equals("BRL"))
                res = org * 0.03;
            else if (conStr.equals("ZAR"))
                res = org * 0.12;
            else if (conStr.equals("HKD"))
                res = org * 0.07;
            else if(conStr.equals("SGD"))
                res = org * 0.01;
            else if (conStr.equals ("USD"))
                res = org;
        }
        else if (orgStr.equals("GBP"))
        {
            if (conStr.equals("EUR"))
                res = org * 1.15;
            else if(conStr.equals("JPY"))
                res = org * 18.63;
            else if(conStr.equals("GBP"))
                res = org;
            else if(conStr.equals("AUD"))
                res = org * 1.80;
            else if (conStr.equals("CAD"))
                res = org * 1.72;
            else if (conStr.equals("CHF"))
                res = org * 1.31;
            else if (conStr.equals("CNY"))
                res = org * 9.07;
            else if (conStr.equals("SEK"))
                res = org * 11.79;
            else if (conStr.equals("NZD"))
                res = org * 1.94;
            else if (conStr.equals("MXN"))
                res = org * 26.33;
            else if (conStr.equals("NOK"))
                res = org * 10.96;
            else if (conStr.equals("KRW"))
                res = org * 1470.62;
            else if (conStr.equals("TRY"))
                res = org * 7.14;
            else if (conStr.equals("RUB"))
                res = org * 0.59;
            else if (conStr.equals("INR"))
                res = org * 87.36;
            else if (conStr.equals("BRL"))
                res = org * 4.91;
            else if (conStr.equals("ZAR"))
                res = org * 18.47;
            else if (conStr.equals("HKD"))
                res = org * 10.22;
            else if(conStr.equals("SGD"))
                res = org * 1.80;
            else if (conStr.equals ("USD"))
                res = org * 1.31;
        }
        else if (orgStr.equals("AUD"))
        {
            if (conStr.equals("EUR"))
                res = org * 1.15;
            else if(conStr.equals("JPY"))
                res = org * 18.63;
            else if(conStr.equals("GBP"))
                res = org;
            else if(conStr.equals("AUD"))
                res = org * 1.80;
            else if (conStr.equals("CAD"))
                res = org * 1.72;
            else if (conStr.equals("CHF"))
                res = org * 1.31;
            else if (conStr.equals("CNY"))
                res = org * 9.07;
            else if (conStr.equals("SEK"))
                res = org * 11.79;
            else if (conStr.equals("NZD"))
                res = org * 1.94;
            else if (conStr.equals("MXN"))
                res = org * 26.33;
            else if (conStr.equals("NOK"))
                res = org * 10.96;
            else if (conStr.equals("KRW"))
                res = org * 1470.62;
            else if (conStr.equals("TRY"))
                res = org * 7.14;
            else if (conStr.equals("RUB"))
                res = org * 0.59;
            else if (conStr.equals("INR"))
                res = org * 87.36;
            else if (conStr.equals("BRL"))
                res = org * 4.91;
            else if (conStr.equals("ZAR"))
                res = org * 18.47;
            else if (conStr.equals("HKD"))
                res = org * 10.22;
            else if(conStr.equals("SGD"))
                res = org * 1.80;
            else if (conStr.equals ("USD"))
                res = org * 1.31;
        }

        //set the result to converted amount
        resText.setText(Double.toString(res));


    }
}
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
    EditText original, converted;
    TextView originalLabeltxt, convertLabeltxt, anticipatetxt;
    Spinner currencySelectO, currencySelectC;

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
        Toast toast = Toast.makeText(getApplicationContext(), "Currency Selected: " +
                String.valueOf(currencySelectO.getSelectedItem()),Toast.LENGTH_SHORT);
        toast.show();
    }
}
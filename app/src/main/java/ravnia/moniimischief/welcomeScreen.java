package ravnia.moniimischief;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class welcomeScreen extends AppCompatActivity implements OnClickListener
{
    //objects
    Button go;
    TextView welcome;

    //create screen
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        //initialize objects needed
        go = findViewById(R.id.letsGo);
        welcome =findViewById(R.id.welcome);

        //set onclicklistener to go button
        go.setOnClickListener(this);
    }

    //what happens when you click lets go -- next screen
    public void onClick(View view)
    {
        Intent goIntent = new Intent(this, main_screen.class);
        startActivity(goIntent);
    }

}

package ruger.touch.sheshan.com.touchdownscorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import ruger.touch.sheshan.com.touchdownscorer.handlers.MatchHandler;
import ruger.touch.sheshan.com.touchdownscorer.handlers.TeamHandler;
import ruger.touch.sheshan.com.touchdownscorer.util.Util;

public class StartScreen extends AppCompatActivity {

    Button matchStartButton;
    Spinner schoolASpinner ,schoolBSpinner ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        matchStartButton = (Button) findViewById(R.id.button_start_match);
        schoolASpinner = (Spinner) findViewById(R.id.spinner_school1);
        schoolBSpinner = (Spinner) findViewById(R.id.spinner_school2);
        matchStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String schoolA = schoolASpinner.getSelectedItem().toString();
                String schoolB = schoolBSpinner.getSelectedItem().toString();
                if(schoolA.equals(schoolB)){
                    Toast.makeText(getApplicationContext(),
                            Util.getERROR_SAME_SCHOOL(), Toast.LENGTH_SHORT).show();
                }
                else {
                    MatchHandler.setMatch(1,schoolA,schoolB);
                    Intent intent = new Intent(StartScreen.this, ScoringScreen.class);
                    finish();
                    startActivity(intent);
                }

            }
        });


    }
}

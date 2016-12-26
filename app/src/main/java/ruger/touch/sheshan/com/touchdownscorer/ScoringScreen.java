package ruger.touch.sheshan.com.touchdownscorer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ruger.touch.sheshan.com.touchdownscorer.handlers.MatchHandler;
import ruger.touch.sheshan.com.touchdownscorer.handlers.TeamHandler;
import ruger.touch.sheshan.com.touchdownscorer.model.Match;
import ruger.touch.sheshan.com.touchdownscorer.util.Util;

/**
 * Created by sheshan on 12/18/16.
 */

public class ScoringScreen extends Activity {

    TextView txt_schoolOneName , txt_schoolTwoName ,txt_schoolOnePoints , txt_schoolTwoPoints;
    Spinner spinnerTeamWhoScored ,spinnerPlayerWhoScored ,spinnerScoredPoints ,spinnerScoreMethod;
    String teamWhoScored;
    Button submitScore;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_screen);

        txt_schoolOneName = (TextView) findViewById(R.id.txt_schoolOneName);
        txt_schoolTwoName = (TextView) findViewById(R.id.txt_schoolTwoName);
        txt_schoolOnePoints = (TextView) findViewById(R.id.txt_teamOneScore);
        txt_schoolTwoPoints = (TextView) findViewById(R.id.txt_teamTwoScore);
        spinnerTeamWhoScored =  (Spinner) findViewById(R.id.select_temWhoScored);
        spinnerPlayerWhoScored =  (Spinner) findViewById(R.id.select_PlayerWhoScored);
        spinnerScoredPoints =  (Spinner) findViewById(R.id.select_ScoredPoints);
        spinnerScoreMethod =  (Spinner) findViewById(R.id.select_ScoredMethod);
        submitScore = (Button) findViewById(R.id.button_submitScore);


        txt_schoolOneName.setText(MatchHandler.getMatch().getTeamOne().getName());
        txt_schoolTwoName.setText(MatchHandler.getMatch().getTeamTwo().getName());
        addItemsOnSpinnerTeamemWhoScored();
        teamWhoScored = spinnerTeamWhoScored.getSelectedItem().toString();
        if(teamWhoScored != null && !teamWhoScored.isEmpty()){
            addItemsOnSpinnerPlayerWhoScored();
        }

        spinnerTeamWhoScored.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                teamWhoScored = spinnerTeamWhoScored.getSelectedItem().toString();
                addItemsOnSpinnerPlayerWhoScored();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });



        submitScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pointsStringValue = spinnerScoredPoints.getSelectedItem().toString();
                if(teamWhoScored.equals(MatchHandler.getMatch().getTeamOne().getName())){
                    int points = MatchHandler.getMatch().getTeamOneScore().getScore();
                    points = points + Integer.parseInt(pointsStringValue);
                    MatchHandler.getMatch().getTeamOneScore().setScore(points);
                    txt_schoolOnePoints.setText(Integer.toString(points));
                }else{
                    int points = MatchHandler.getMatch().getTeamTwoScore().getScore();
                    points = points + Integer.parseInt(pointsStringValue);
                    MatchHandler.getMatch().getTeamTwoScore().setScore(points);
                    txt_schoolTwoPoints.setText(Integer.toString(points));

                }
            }
        });

    }




    public void addItemsOnSpinnerTeamemWhoScored() {

        List<String> list = new ArrayList<String>();
        list.add(MatchHandler.getMatch().getTeamOne().getName());
        list.add(MatchHandler.getMatch().getTeamTwo().getName());
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTeamWhoScored.setAdapter(dataAdapter);
    }

    public void addItemsOnSpinnerPlayerWhoScored() {

        List<String> list = new ArrayList<String>();
        TeamHandler teamHandler =new TeamHandler();
        if(teamWhoScored.equals(MatchHandler.getMatch().getTeamOne().getName())){
            list = teamHandler.getPlayersNameList(MatchHandler.getMatch().getTeamOne());
        }
        else{
            list = teamHandler.getPlayersNameList(MatchHandler.getMatch().getTeamTwo());
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPlayerWhoScored.setAdapter(dataAdapter);
    }
}

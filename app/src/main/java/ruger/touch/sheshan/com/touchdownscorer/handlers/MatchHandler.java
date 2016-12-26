package ruger.touch.sheshan.com.touchdownscorer.handlers;

import ruger.touch.sheshan.com.touchdownscorer.model.Match;
import ruger.touch.sheshan.com.touchdownscorer.model.Team;
import ruger.touch.sheshan.com.touchdownscorer.util.JsonTest;

/**
 * Created by sheshan on 12/25/16.
 */

public class MatchHandler {

    private static Match match;

    public static Match getMatch() {
        return match;
    }

    public static void setMatch(int matchNo , String schoolA , String schoolB) {
        TeamHandler teamHandlerA = new TeamHandler();
        ScoreHandler scoeHandlerA = new ScoreHandler();
        TeamHandler teamHandlerB = new TeamHandler();
        ScoreHandler scoeHandlerB = new ScoreHandler();
        teamHandlerA.setTeam(schoolA);
        Team teamOne = teamHandlerA.getTeam();
        scoeHandlerA.setScore(teamOne ,0);
        teamHandlerB.setTeam(schoolB);
        Team teamTwo =teamHandlerB.getTeam();
        scoeHandlerB.setScore(teamTwo , 0);
        match = new Match();
        match.setMatchNo(matchNo);
        match.setTeamOne(teamOne);
        match.setTeamTwo(teamTwo);
        match.setTeamOneScore(scoeHandlerA.getScore());
        match.setTeamTwoScore(scoeHandlerB.getScore());

    }

    public static void updateScore(){

    }
}

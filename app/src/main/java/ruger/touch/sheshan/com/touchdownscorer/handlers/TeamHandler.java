package ruger.touch.sheshan.com.touchdownscorer.handlers;

import java.util.ArrayList;
import java.util.List;

import ruger.touch.sheshan.com.touchdownscorer.model.Player;
import ruger.touch.sheshan.com.touchdownscorer.model.Team;
import ruger.touch.sheshan.com.touchdownscorer.util.JsonTest;

/**
 * Created by sheshan on 12/25/16.
 */

public class TeamHandler {

    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(String teamName) {
        team = new Team();
        team.setName(teamName);
        team.setPlayerList(JsonTest.setTeamPlayers(teamName));
        //TBD

    }

    public List<String> getPlayersNameList(Team teamOne){
        List <String> playerNameList =new ArrayList<>();
        List <Player> playerList = teamOne.getPlayerList();
        for (int i = 0; i < playerList.size(); i++) {
            playerNameList.add(playerList.get(i).getName());
        }
        return playerNameList;
    }



}

package ruger.touch.sheshan.com.touchdownscorer.model;

/**
 * Created by sheshan on 12/25/16.
 */

public class Match {

    private int matchNo;
    private Team teamOne;
    private Team teamTwo;
    private Score teamOneScore;
    private Score teamTwoScore;
    private String venue;

    public int getMatchNo() {
        return matchNo;
    }

    public void setMatchNo(int matchNo) {
        this.matchNo = matchNo;
    }

    public Team getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(Team teamOne) {
        this.teamOne = teamOne;
    }

    public Team getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(Team teamTwo) {
        this.teamTwo = teamTwo;
    }

    public Score getTeamOneScore() {
        return teamOneScore;
    }

    public void setTeamOneScore(Score teamOneScore) {
        this.teamOneScore = teamOneScore;
    }

    public Score getTeamTwoScore() {
        return teamTwoScore;
    }

    public void setTeamTwoScore(Score teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}

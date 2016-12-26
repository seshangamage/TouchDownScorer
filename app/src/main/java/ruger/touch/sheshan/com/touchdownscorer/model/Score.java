package ruger.touch.sheshan.com.touchdownscorer.model;

/**
 * Created by sheshan on 12/25/16.
 */

public class Score {

    private int score;
    private Team scoringTeam;
    private Player scoringPlayer;
    private String details;
    private String timestamp;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Team getScoringTeam() {
        return scoringTeam;
    }

    public void setScoringTeam(Team scoringTeam) {
        this.scoringTeam = scoringTeam;
    }

    public Player getScoringPlayer() {
        return scoringPlayer;
    }

    public void setScoringPlayer(Player scoringPlayer) {
        this.scoringPlayer = scoringPlayer;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}

package ruger.touch.sheshan.com.touchdownscorer.handlers;

import ruger.touch.sheshan.com.touchdownscorer.model.Score;
import ruger.touch.sheshan.com.touchdownscorer.model.Team;

/**
 * Created by sheshan on 12/25/16.
 */

public class ScoreHandler {

    private Score score;

    public Score getScore() {
        return score;
    }

    public void setScore( Team team ,int startscore) {
        Score score = new Score();
        score.setScore(startscore);
        score.setScoringTeam(team);
        this.score = score;
    }
}

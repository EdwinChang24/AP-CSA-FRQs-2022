package io.github.edwinchang24.q1;

import io.github.edwinchang24.annotations.PostCondition;
import io.github.edwinchang24.annotations.PreCondition;
import io.github.edwinchang24.annotations.Question;
import io.github.edwinchang24.annotations.RealImplNotShown;

/**
 * @see <a href="https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf#page=3">AP CSA 2022 FRQs Q1</a>
 */
@SuppressWarnings({"unused", "FieldMayBeFinal"})
public class Game {

    /**
     * The first level of the game.
     */
    private Level levelOne;

    /**
     * The second level of the game.
     */
    private Level levelTwo;

    /**
     * The third level of the game.
     */
    private Level levelThree;

    /**
     * Constructs a new game.
     */
    @PostCondition("All instance variables have been initialized.")
    @RealImplNotShown
    public Game() {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    /**
     * @return true if this game is a bonus game and false otherwise.
     */
    @RealImplNotShown
    public boolean isBonus() {
        return false;
    }

    /**
     * Simulates the play of this game (consisting of three levels) and updates all relevant game data.
     */
    @RealImplNotShown
    public void play() {}

    /**
     * @return the score earned in the most recently played game, as described in part (a).
     */
    @Question(number = 1, part = "a")
    public int getScore() {
        int score = 0;
        if (levelOne.goalReached()) {
            score += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                score += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    score += levelThree.getPoints();
                }
            }
        }
        if (isBonus()) score *= 3;
        return score;
    }

    /**
     * Simulates the play of <code>num</code> games and returns the highest score earned, as described in part (b).
     */
    @PreCondition("num > 0")
    @Question(number = 1, part = "b")
    public int playManyTimes(int num) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            play();
            if (getScore() > max) max = getScore();
        }
        return max;
    }
}

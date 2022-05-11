package io.github.edwinchang24.q1;

import io.github.edwinchang24.annotations.HiddenMembers;
import io.github.edwinchang24.annotations.RealImplNotShown;

/**
 * @see <a href="https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf#page=3">AP CSA 2022 FRQs Q1</a>
 */
@HiddenMembers
public class Level {
    /**
     * @return true if the player reached the goal on this level and false otherwise.
     */
    @RealImplNotShown
    public boolean goalReached() {
        return true;
    }

    /**
     * @return the number of points (a positive integer) recorded for this level.
     */
    @RealImplNotShown
    public int getPoints() {
        return 100;
    }
}

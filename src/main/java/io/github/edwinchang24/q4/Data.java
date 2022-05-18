package io.github.edwinchang24.q4;

import io.github.edwinchang24.annotations.HiddenMembers;
import io.github.edwinchang24.annotations.PreCondition;
import io.github.edwinchang24.annotations.Question;
import io.github.edwinchang24.annotations.RealImplNotShown;

/**
 * @see <a href="https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf#page=14">AP CSA 2022 FRQs Q4</a>
 */
@HiddenMembers
@SuppressWarnings("unused")
public class Data {
    /**
     * The maximum value of any item in the grid.
     */
    @RealImplNotShown
    public static final int MAX = 1000;

    /**
     * A two-dimensional array of integers representing a collection of randomly generated data.
     */
    private int[][] grid;

    /**
     * Fills grid with randomly generated values, as described in part (a).
     */
    @PreCondition({"grid is not null.", "grid has at least one element."})
    @Question(number = 4, part = "a")
    public void repopulate() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int num = (int) (Math.random() * MAX) + 1;
                while (num % 10 != 0 || num % 100 == 0) {
                    num = (int) (Math.random() * MAX) + 1;
                }
                grid[i][j] = num;
            }
        }
    }

    /**
     * @return the number of columns in grid that are in increasing order, as described in part (b).
     */
    @PreCondition({"grid is not null.", "grid has at least one element."})
    @Question(number = 4, part = "b")
    public int countIncreasingCols() {
        int total = 0;
        for (int i = 0; i < grid[0].length; i++) {
            if (grid.length == 1) continue;
            boolean inc = true;
            for (int j = 1; j < grid.length; j++) {
                if (grid[j - 1][i] > grid[j][i]) {
                    inc = false; break;
                }
            }
            if (inc) total++;
        }
        return total;
    }

}

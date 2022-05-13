package io.github.edwinchang24.q3;

import io.github.edwinchang24.annotations.PostCondition;
import io.github.edwinchang24.annotations.PreCondition;
import io.github.edwinchang24.annotations.Question;
import io.github.edwinchang24.annotations.RealImplNotShown;

import java.util.ArrayList;

/**
 * @see <a href="https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf#page=10">AP CSA 2022 FRQs Q2</a>
 */
@SuppressWarnings({"unused", "MismatchedReadAndWriteOfArray"})
public class ReviewAnalysis {

    /**
     * All user reviews to be included in this analysis.
     */
    private Review[] allReviews;

    /**
     * Initializes <code>allReviews</code> to contain all the <code>Review</code> objects to be analyzed.
     */
    @RealImplNotShown
    public ReviewAnalysis() {
    }

    /**
     * Returns a double representing the average rating of all the <code>Review</code> objects to be analyzed, as
     * described in part (a).
     */
    @PreCondition({"allReviews contains at least one Review.", "No element of allReviews is null."})
    @Question(number = 3, part = "a")
    public double getAverageRating() {
        int total = 0;
        for (Review r : allReviews) total += r.getRating();
        return (double) total / allReviews.length;
    }

    /**
     * Returns an ArrayList of String objects containing formatted versions of selected user comments, as described in
     * part (b).
     */
    @PreCondition({"allReviews contains at least one Review.", "No element of allReviews is null."})
    @PostCondition("allReviews is unchanged.")
    @Question(number = 3, part = "b")
    @SuppressWarnings("IndexOfReplaceableByContains")
    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<>();
        for (int i = 0; i < allReviews.length; i++) {
            String c = allReviews[i].getComment();
            if (c.indexOf("!") == -1) continue;
            String lastChar = c.substring(c.length() - 1);
            if (!(lastChar.equals(".") || lastChar.equals("!"))) c += ".";
            comments.add(i + "-" + c);
        }
        return comments;
    }

}

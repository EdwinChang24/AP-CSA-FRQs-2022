package io.github.edwinchang24.q3;

import io.github.edwinchang24.annotations.HiddenMembers;
import io.github.edwinchang24.annotations.PreCondition;

/**
 * @see <a href="https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf#page=10">AP CSA 2022 FRQs Q3</a>
 */
@HiddenMembers
@SuppressWarnings("FieldMayBeFinal")
public class Review {

    /**
     * The rating given in this review.
     */
    private int rating;

    /**
     * The comment of this review.
     */
    private String comment;

    /**
     * Constructs a review with the given rating and comment.
     * @param r the rating given in this review.
     * @param c the comment of this review.
     */
    @PreCondition({"r >= 0", "c is not null."})
    public Review(int r, String c) {
        rating = r;
        comment = c;
    }

    /**
     * @return the rating given in this review.
     */
    public int getRating() {
        return rating;
    }

    /**
     * @return the comment of this review.
     */
    public String getComment() {
        return comment;
    }

}

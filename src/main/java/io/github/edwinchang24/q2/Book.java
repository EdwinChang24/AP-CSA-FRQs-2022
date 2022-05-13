package io.github.edwinchang24.q2;

import io.github.edwinchang24.annotations.HiddenMembers;
import io.github.edwinchang24.annotations.RealImplNotShown;

/**
 * @see <a href="https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf#page=8">AP CSA 2022 FRQs Q2</a>
 */
@HiddenMembers
@SuppressWarnings("FieldMayBeFinal")
public class Book {

    /**
     * The title of the <code>Book</code>.
     */
    private String title;

    /**
     * The price of the <code>Book</code>.
     */
    private double price;

    /**
     * Creates a new <code>Book</code> with the given title and price.
     * @param bookTitle the title of the <code>Book</code>.
     * @param bookPrice the price of the <code>Book</code>.
     */
    @RealImplNotShown
    public Book(String bookTitle, double bookPrice) {
        title = bookTitle;
        price = bookPrice;
    }

    /**
     * @return the title of the <code>Book</code>.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return a string containing the price and title of the <code>Book</code>.
     */
    public String getBookInfo() {
        return title + "-" + price;
    }

}

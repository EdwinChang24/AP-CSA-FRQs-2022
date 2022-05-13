package io.github.edwinchang24.q2;

import io.github.edwinchang24.annotations.Question;

/**
 * @see <a href="https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf#page=8">AP CSA 2022 FRQs Q2</a>
 */
@Question(number = 2)
@SuppressWarnings({"unused", "FieldMayBeFinal"})
public class Textbook extends Book {

    /**
     * The edition of the <code>Textbook</code>.
     */
    private int edition;

    /**
     * Constructs a <code>Textbook</code> with the given title, price, and edition.
     * @param bookTitle the title of the <code>Textbook</code>.
     * @param bookPrice the price of the <code>Textbook</code>.
     * @param bookEdition the edition of the <code>Textbook</code>.
     */
    public Textbook(String bookTitle, double bookPrice, int bookEdition) {
        super(bookTitle, bookPrice);
        edition = bookEdition;
    }

    /**
     * @return the edition of the <code>Textbook</code>.
     */
    public int getEdition() {
        return edition;
    }

    /**
     * @return a string containing the title, price, and edition of the <code>Textbook</code>.
     */
    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }

    /**
     * @param t another <code>Textbook</code> that can potentially be substituted by this one.
     * @return true if this <code>Textbook</code> is a valid substitute for <code>t</code> and false
     * otherwise.
     */
    public boolean canSubstituteFor(Textbook t) {
        return getTitle().equals(t.getTitle()) && getEdition() >= t.getEdition();
    }

}

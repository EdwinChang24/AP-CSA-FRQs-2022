package io.github.edwinchang24.annotations;

/**
 * Indicates that the annotated element is meant to be completed as one of the responses on the exam.
 */
public @interface Question {
    /**
     * The number of the question.
     */
    int number();

    /**
     * The letter indicating the part of the question.
     */
    String part() default "";
}

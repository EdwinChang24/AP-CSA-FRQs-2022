package io.github.edwinchang24.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Indicates that this condition must be true after the annotated method is executed.
 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface PostCondition {
    /**
     * The condition that must be true.
     */
    String value();
}

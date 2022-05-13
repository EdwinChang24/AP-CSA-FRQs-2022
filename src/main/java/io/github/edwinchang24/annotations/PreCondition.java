package io.github.edwinchang24.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Indicates that this condition is assumed to be true before the annotated method is called.
 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface PreCondition {
    /**
     * The condition(s) assumed to be true.
     */
    String[] value();
}

package io.github.edwinchang24.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated class contains variables, constructors, and/or methods that are not shown.
 */
@Target(ElementType.TYPE)
public @interface HiddenMembers { }

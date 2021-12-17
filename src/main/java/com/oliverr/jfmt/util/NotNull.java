package com.oliverr.jfmt.util;

import java.lang.annotation.*;

/**
 * <p>
 * This annotation does nothing on its own.
 * This acts as a Documentation tool.
 * <p>
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.PARAMETER)
@Documented
public @interface NotNull {
}
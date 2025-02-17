package com.annotation.builtinannotation.customannotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskInfo {
    int priority() default 1;
    String assignedTo() default "Sweta";
}
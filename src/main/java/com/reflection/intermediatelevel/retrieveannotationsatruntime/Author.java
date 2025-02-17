package com.reflection.intermediatelevel.retrieveannotationsatruntime;

import java.lang.annotation.*;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.TYPE) // Applicable to classes
@interface Author {
    String name(); // Annotation element
}
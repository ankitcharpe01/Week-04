package com.annotation.builtinannotation.repeatableannotations;
import java.lang.reflect.Method;

public class BugTracker {
    @BugReport(description = "Null pointer exception on line 34")
    @BugReport(description = "Array index out of bounds at line 45")
    public static void processData() {
        System.out.println("Processing data...");
    }

    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("processData");
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        for (BugReport bugReport : bugReports) {
            System.out.println("Bug: " + bugReport.description());
        }
    }
}

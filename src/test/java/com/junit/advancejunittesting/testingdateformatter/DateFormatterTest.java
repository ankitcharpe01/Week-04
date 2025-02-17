package com.junit.advancejunittesting.testingdateformatter;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    @Test
    public void testValidDate() throws ParseException {
        DateFormatter dateFormatter = new DateFormatter();
        assertEquals("15-02-2025", dateFormatter.formatDate("2025-02-15"));
    }
}
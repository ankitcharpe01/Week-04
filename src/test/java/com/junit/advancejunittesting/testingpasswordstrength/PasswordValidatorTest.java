package com.junit.advancejunittesting.testingpasswordstrength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    PasswordValidator passwordValidator = new PasswordValidator();
    @Test
    void testValidPassword() {
        assertTrue(passwordValidator.isValid("Valid123"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(passwordValidator.isValid("Short1"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(passwordValidator.isValid("lowercase1"));
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(passwordValidator.isValid("NoDigitHere"));
    }

    @Test
    void testPasswordWithoutUppercaseAndDigit() {
        assertFalse(passwordValidator.isValid("nouppercasenodigit"));
    }
}
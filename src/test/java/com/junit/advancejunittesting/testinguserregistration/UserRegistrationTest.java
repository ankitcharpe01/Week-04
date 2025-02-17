package com.junit.advancejunittesting.testinguserregistration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    @Test
    public void testValidUserRegistration() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.registerUser("validUser", "user@example.com", "validPwd123");
        } catch (IllegalArgumentException e) {
            fail("Valid registration failed with exception: " + e.getMessage());
        }
    }

}
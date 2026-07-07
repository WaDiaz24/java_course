package com.devsenior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void testLoginSuccess() {
        User user = new User("testuser", "test@email.com", "password123");
        boolean result = user.authenticate("password123");
        Assertions.assertTrue(result);
        Assertions.assertTrue(user.isAuthenticated());
    }

    @Test
    public void testLoginFailure() {
        User user = new User("testuser", "test@email.com", "password123");
        boolean result = user.authenticate("wrongpassword");
        Assertions.assertFalse(result);
        Assertions.assertFalse(user.isAuthenticated());
    }

}

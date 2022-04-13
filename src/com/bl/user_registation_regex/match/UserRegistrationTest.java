package com.bl.user_registation_regex.match;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void enteredFirstNameShouldMatchPatter() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addUser();
    }
}

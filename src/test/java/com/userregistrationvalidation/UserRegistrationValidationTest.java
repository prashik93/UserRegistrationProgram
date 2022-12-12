package com.userregistrationvalidation;

import org.example.UserRegistration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationValidationTest {
    private String firstName;
    private String expectedResult;

    private UserRegistration userRegistration;

    public UserRegistrationValidationTest(String firstName, String expectedResult) {
        super();
        this.firstName = firstName;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] { {"Prashik", "Valid"} });

    }

    @Test
    public void validateFirstNameTest() {
        System.out.println("FirstName expected : " + expectedResult);
        assertEquals(expectedResult, userRegistration.validateFirstName(firstName));
    }
}

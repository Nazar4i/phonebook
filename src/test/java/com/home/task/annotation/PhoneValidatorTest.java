package com.home.task.annotation;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PhoneValidatorTest {
    private PhoneValidator validator = new PhoneValidator();
    private String phone1 = "89261234567";
    private String phone2 = "+38(095)3373637";
    private String phone3 = "+38(097)3373637";
    private String phone4 = "+38(097)3373637";

    @Test
    public void testIsValid() throws Exception {
        boolean result = validator.isValid(phone1, null);
        assertTrue(result);
    }

}
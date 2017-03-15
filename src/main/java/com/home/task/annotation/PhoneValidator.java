package com.home.task.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<Phone, String> {
    @Override
    public void initialize(Phone phone) {

    }

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
        if (phone == null) {
            return false;
        }

        if (phone.matches("^( +)?((\\+?3|8) ?)?((\\(\\d{3}\\))|(\\d{3}))?( )?(\\d{3}[\\- ]?\\d{2}[\\- ]?\\d{2})( +)?$"))
            return true;
        else return false;
    }
}

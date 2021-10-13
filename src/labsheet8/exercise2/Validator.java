package labsheet8.exercise2;

import static java.lang.Character.*;

public class Validator {
    public static boolean isValidRegistrationNumber(String reg) {
        if (reg.length() >= 6 && reg.length() <= 12) {
            if (isDigit(reg.charAt(0)) && isDigit(reg.charAt(1))) {
                if (reg.charAt(2) == '-') {
                    if ( (isUpperCase(reg.charAt(3)) && isUpperCase(reg.charAt(4)) && reg.charAt(5) == '-') ||
                            isUpperCase(reg.charAt(3)) && reg.charAt(4) == '-' && isDigit(reg.charAt(5)) ) {
                        String end = reg.substring(6);
                        return end.chars().allMatch( Character::isDigit );
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
